package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NetworkingUtils {

    public static void openLink(String link) {
        try {
            Desktop.getDesktop().browse(URI.create(link));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void download(String link, String target){
        try(InputStream in = new URL(link).openStream()){
            Files.copy(in, Paths.get(target));
            Download.setDone(true);

            if(new File(target).exists())
                Download.setFileExists(true);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
