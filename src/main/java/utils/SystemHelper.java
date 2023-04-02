package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SystemHelper {

    public static void setWallpaper(String image) {
        try{
            File wallpaper = new File(image);
            Image img = ImageIO.read(wallpaper);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            // skalujemy obrazek do rozmiarow ekranu (zeby sie dobrze wygladalo)
            Image resizedImg = img.getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH);

            // ustawiamy tapete
//            WallpaperSetter.set(resizedImg);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
