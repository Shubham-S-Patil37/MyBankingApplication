package ExtraResources;
import MainFramePkg.MainFrame;
import Database.ReLiveData;
import TansectionPKG.PaymentGateWay;
import TansectionPKG.ScanQR;
import TansectionPKG.SendMoney;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Image;
import javax.swing.JOptionPane;
import static WebCam.TakeShot.webcam;

public class QRReader {
    public static PaymentGateWay gateWay;
    
    public QRReader(Image image){
        
        try {
            String charset = "UTF-8";
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            ReLiveData.upi_id = readQRCode(image, charset, hintMap);
//            new SendMoney(readQRCode(image, charset, hintMap),1).show();
            MainFrame.sqr.dispose();
            webcam.close();
            gateWay = new PaymentGateWay(readQRCode(image, charset, hintMap));
            gateWay.show();
        } catch (Exception e) {}
    }

    public static void main(String[] args) throws WriterException, IOException,NotFoundException {}
    
    public static String readQRCode(Image image, String charset, Map hintMap)
    throws FileNotFoundException, IOException, NotFoundException {
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
//            new BufferedImageLuminanceSource(
//                ImageIO.read(new FileInputStream(filePath)))));
           new BufferedImageLuminanceSource( Imager.imageToBufferedImage(image))));
        Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, hintMap);
        return qrCodeResult.getText();
    }
}