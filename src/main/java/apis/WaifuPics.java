package apis;

import org.json.JSONObject;
import utils.API;
import utils.Download;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

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

        Download.image(imageUrl);
        System.out.println(imageUrl);
    }
}
