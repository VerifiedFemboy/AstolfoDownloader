package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NetworkingUtils {

    public static void openLink(String link) {
        try {
            Desktop.getDesktop().browse(URI.create(link));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void download(String link, String target) {
        try (InputStream in = new URL(link).openStream()) {
            Files.copy(in, Paths.get(target));
            Download.setDone(true);
            if (new File(target).exists())
                Download.setFileExists(true);

            complete(target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void complete(String target) {
        System.out.println("Download complete! \nDo you want to set this image as a wallpaper? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().toLowerCase()) {
            case "y":
                SystemHelper.setWallpaper(target);
                break;
            case "n":
                break;
        }
    }
}
