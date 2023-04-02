package apis;

import org.json.JSONObject;
import utils.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class WaifuPics {

    public static void download(){
        API waifupics;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sfw or nsfw:");
        String pics = scanner.next().toLowerCase();
        if(pics.equals("nsfw"))
            System.out.println("Choose nsfw tag: \nwaifu, neko, trap, blowjob");
        else
            System.out.println("Choose sfw tag: \nwaifu, neko, trap, shinobu, megumin, bully, cuddle, cry, hug, kiss, lick, pat, smug, bonk, yeet, blush, smile, wave");;
        String tags = scanner.next().toLowerCase();

        try {
            waifupics = new API(new URI("https://api.waifu.pics/" + pics + "/" + tags).toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = waifupics.getJson();

        String imageUrl = json.getString("url");
        FileChooser fileChooser = new FileChooser();
        fileChooser.choosing();
        String path = PathUtils.getPath() + "/" + StringUtils.random() + ".png";
        Download.image(imageUrl, path);
        System.out.println(imageUrl);
    }
}
