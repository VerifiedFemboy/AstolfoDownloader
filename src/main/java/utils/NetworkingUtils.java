package utils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class NetworkingUtils {

    public static void openLink(String link) {
        try {
            Desktop.getDesktop().browse(URI.create(link));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
