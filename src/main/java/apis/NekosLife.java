package apis;

import org.json.JSONObject;
import utils.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class NekosLife {

    public static void download(){
        API nekoslife;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose tag: \nneko, lewd");;

        String tags = scanner.next().toLowerCase();

        try {
            nekoslife = new API(new URI("https://nekos.life/api/v2/img/" + tags).toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = nekoslife.getJson();

        String imageUrl = json.getString("url");
        FileChooser fileChooser = new FileChooser();
        fileChooser.choosing();
        String path = PathUtils.getPath() + "/" + StringUtils.random() + ".png";
        Download.image(imageUrl, path);
        System.out.println(imageUrl);
    }
}
