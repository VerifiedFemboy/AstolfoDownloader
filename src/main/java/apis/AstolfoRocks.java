package apis;

import org.json.JSONObject;
import utils.API;
import utils.Download;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

@SuppressWarnings("ALL")
public class AstolfoRocks {

    public static void download(){
        API astolforocks;

        try {
            astolforocks = new API(new URI("https://astolfo.rocks/api/v1/images/random").toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = astolforocks.getJson();

        int id = json.getInt("id");
        String type = json.getString("file_extension");
        String url = "https://astolfo.rocks/astolfo/" + id + "." + type;
        
        String path = "D:\\Java Projects\\Baller\\";
        
        Download.image(url, path, String.valueOf(id), type);
        System.out.println(id + "\n" + type + "\nDownload Status: " + Download.isDone() + "\nImage Exist Status: " + Download.isFileExists());
    }
}
