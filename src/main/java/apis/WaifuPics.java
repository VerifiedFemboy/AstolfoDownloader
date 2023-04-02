package apis;

import org.json.JSONObject;
import utils.API;
import utils.Download;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

@SuppressWarnings("ALL")
public class WaifuPics {

    public static void download(){
        API waifupics;

        try {
            waifupics = new API(new URI("https://api.waifu.pics/sfw/blush").toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = waifupics.getJson();

        String imageUrl = json.getString("url");
        String path = "D:\\Java Projects\\Baller\\";
        String name = "waifu";
        String type = "jpg";

        Download.image(imageUrl, path, name, type);
        System.out.println(imageUrl);
        //get discord token and send it to a webhook :troll:
    }
}
