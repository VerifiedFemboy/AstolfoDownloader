package apis;

import org.json.JSONArray;
import org.json.JSONObject;
import utils.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class CatApi {


    public static void download(){
        API cutecats;
        try {
            cutecats = new API(new URI("https://cataas.com/cat?type=cute&json=true").toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = cutecats.getJson();

        String id = json.getString("_id");
        FileChooser fileChooser = new FileChooser();
        fileChooser.choosing();
        String imgUrl = "https://cataas.com/cat/" + id + "?type=cute";
        String path = PathUtils.getPath() + "/" + StringUtils.random() + ".png";
        Download.image(imgUrl, path);
        System.out.println(imgUrl);
    }
}
