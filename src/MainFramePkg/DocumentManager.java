package MainFramePkg;
import ExtraResources.Imager;
import ExtraResources.InternetConnection;
import ExtraResources.ManageResources;
import ExtraResources.ViewImage;
import LoginControllerPKG.LogInFrame;
import static MainFramePkg.MainFrame.rd;
import NotifocationComponents.DoubleClickNotification;
import NotifocationComponents.SingleClickNotification;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static MainFramePkg.MainFrame.ut;


public class DocumentManager {
    static Imager imger  = new Imager();
    public static void varifyDocument(String docName, String saveAs){
        rd.reliveDocumentData("Accountno", LogInFrame.account_no);
        
        ThreadManager.varifyDOCTHD = new Thread(new Runnable() {
            public void run() {
                switch(docName){
                    case "Aadhar Card":
                        getDocment(rd.aadharcard, saveAs,rd.directoryPath+"//"+rd.aadharcard,docName.replaceAll(" ", ""));
                        break;
                    case "PAN Card":
                        getDocment(rd.pancard, saveAs,rd.directoryPath+"//"+rd.pancard,docName.replaceAll(" ", ""));
                        break;
                    case "Address Proof":
                        getDocment(rd.addressProof, saveAs,rd.directoryPath+"//"+rd.addressProof,docName.replaceAll(" ", ""));
                        break;
                    case "Leaving Certificate":
                        getDocment(rd.lc, saveAs,rd.directoryPath+"//"+rd.lc,docName.replaceAll(" ", ""));
                        break;
                    case "Education Certificate":
                        getDocment(rd.ec, saveAs,rd.directoryPath+"//"+rd.ec,docName.replaceAll(" ", ""));
                        break;
                    case "Document 1":
                        getDocment(rd.dc1, saveAs,rd.directoryPath+"//"+rd.dc1,docName.replaceAll(" ", ""));
                        break;
                    default:
                        new SingleClickNotification("Default case Working","close") {
                            @Override
                            public void getButtonAction() {
                                dispose();
                            }
                            public void getCloseAction() {
                                dispose();
                            }
                        }.show();
                }
            }
        });
        ThreadManager.varifyDOCTHD.start();
    }
    
    static void getDocment(String file, String saveAs,String path,String documentName){
        rd.reliveDocumentData("Accountno", LogInFrame.account_no);
        if(file.equals("noDoc")){
            uploadDoc(saveAs,documentName);
        }
        else{
            new ViewImage("Upload", "Delete",path) {
                @Override
                public void setOnFirstClick() {
                    creatDocumentCopy(saveAs);
                    ut.imageIcon(ViewImage.jLabel1, rd.directoryPath+"//"+saveAs);
                }
                @Override
                public void setOnSecondClick() {
                    try {
                        rd.insertORupdateDataBase("update Documents set "+documentName+" = 'noDoc' where Accountno = '"+LogInFrame.account_no+"'");
                        ManageResources.JFileRemover(path);
                        dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.show();
        }    
    }

    static void creatDocumentCopy(String saveAs){
        rd.reliveDocumentData("Accountno", LogInFrame.account_no);
        try {
            imger.copyManager(ImageIO.read(new File(ut.myFileChooser())), saveAs,rd.directoryPath);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void uploadDoc(String SaveName, String documentName){
        new DoubleClickNotification("OOPS ! NO DOCUMENTS FOUND", "Upload Document", "Help"){
            @Override
            public void setOnFirstClick() {
                imger.copyManager(imger.bufferImage(ut.myFileChooser()), SaveName, rd.directoryPath);
                rd.insertORupdateDataBase("update Documents set "+documentName+" = '"+SaveName+"' where Accountno = '"+LogInFrame.account_no+"'");
            }

            @Override
            public void setOnSecondClick() {
                if(InternetConnection.checkConnnection()){
                    try {
                        Desktop.getDesktop().browse(new File("C:\\Users\\Lenovo\\Desktop\\ppt\\FSD\\pr_2\\html 2.html").toURI());
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    new SingleClickNotification("Check your Active Internet Connection !","Close"){
                        @Override
                        public void getButtonAction() {
                            dispose();
                        }
                        public void getCloseAction() {
                            dispose();
                        }
                    }.show();
                    dispose();
                }
            }
            public void setOnCloseClick(){
                dispose();
            }
        }.show();
    }
}
