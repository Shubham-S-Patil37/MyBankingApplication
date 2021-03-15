package ExtraResources;
import com.github.sarxos.webcam.Webcam;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Imager {
    public static Webcam webcam;
    public static Image image;
    public static ImageIcon imageIcon;
    public static BufferedImage bimg,bimg1;
    public static WritableRaster raster;
    public static FileOutputStream deskImage;
//    public static JPEGImageEncoder encoder;
    public static Graphics bg = null;
    static int height,width;
    public static long fileLength;
    public static double cutPercent;
    public static boolean isAlphaPremultiplied;
    public static Utilities utilities = new Utilities();
    public static URL url;
    public static File file,file1;
    public static Graphics2D bGr;
    void functionList(){
        copyManager(bufferImage(""),"","");
//        ImageManager(label,"","");
    }
    
    public static BufferedImage bufferImage(String path){
        try {
            return ImageIO.read(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(Imager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static BufferedImage copyManager(BufferedImage bi, String SaveAsName, String SaveAsPath){
            ColorModel cm = bi.getColorModel();
            isAlphaPremultiplied = cm.isAlphaPremultiplied();
            raster = bi.copyData(null);
            bimg = new BufferedImage(cm, raster, isAlphaPremultiplied, null);
            file = new File(SaveAsPath,SaveAsName);
        try {
            ImageIO.write(bimg, "jpg", file);
        } catch (IOException ex) {
            Logger.getLogger(Imager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bimg;
    }
    
    public static void ImageManager(JLabel label , String name, String path){
        copyManager(imageToBufferedImage(getlabelImage(label)), name, path);
    }
    
    public static Image getlabelImage(JLabel label){
        imageIcon = (ImageIcon) label.getIcon();
        image = imageIcon.getImage();
        return image;
    }
    
    public static Image getButtonImage(JButton button){
        imageIcon = (ImageIcon) button.getIcon();
        image = imageIcon.getImage();
        return image;
    }
        
    public static BufferedImage imageToBufferedImage(Image im) {
        /*
            imageToBufferedImage and imageToBufferedImage1 both code are running
        */
        bimg = new BufferedImage
        (im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
        bg = bimg.getGraphics();
        bg.drawImage(im, 0, 0, null);
        bg.dispose();
        return bimg;
    }
    
    public static BufferedImage imageToBufferedImage1(Image img)
    {
        if (img instanceof BufferedImage)
            return (BufferedImage) img;

        // Create a buffered image with transparency
        bimg = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        // Draw the image on to the buffered image
        bGr = bimg.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        // Return the buffered image
        return bimg;
    }
    
    public static void JGifPlayer(JLabel label, String path) throws MalformedURLException{
//        URL url = new URL(path);
//        Icon icon = new ImageIcon(url);
        url = Imager.class.getResource("/res/images/animated.gif");
        imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
    }
    
//    public static Image CompressPic(String srcPath, String targetPath){
//        try {
//            cutPercent = 0;
//            file = new File(srcPath);
//            bimg1  = ImageIO.read(new FileInputStream(file));
//            width =  bimg1.getWidth(null);
//            height = bimg1.getHeight(null);
//            fileLength = file.length();
//            do {
//                width = (int)(width*(1-cutPercent));
//                height = (int)(height*(1-cutPercent));
//                bimg  = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
//                bimg.getGraphics().drawImage(bimg1, 0, 0, width, height, null); // sketch of the reduced
//                deskImage = new FileOutputStream (targetPath); // to the output file stream
//                encoder = JPEGCodec.createJPEGEncoder(deskImage);
//                encoder.encode (bimg); // near JPEG encoding
//                deskImage.close();
//
//                file1 = new File(targetPath);
//                bimg = ImageIO.read(new FileInputStream(file1));
//                width = bimg.getWidth(null);
//                height = bimg.getHeight(null);
//                fileLength = file1.length();
//            }while((fileLength/1024)>=1070);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Imager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Imager.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return new ImageIcon(bimg).getImage();
//    }

    public static void main(String[] args) throws IOException, Exception {
        copyManager(bufferImage(utilities.myFileChooser()),"shubham.png","D//");
        System.out.println(""+bufferImage("").getHeight());
    }
}