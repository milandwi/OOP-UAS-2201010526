package kos;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Milan_2201010526
 */
public class loadIMG {
    public static BufferedImage loadIMG (String urlGambar){
        BufferedImage bimg =null; 
        try {
            bimg = ImageIO.read(new File(urlGambar));
        }catch (IOException e){
            System.out.println("Gagal load gambar; "+e.getMessage());
        }
        return bimg;
    }
    }
