import org.json.JSONObject;
import utils.API;
import utils.Download;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {


    public static void main(String[] args){
        API astolforocks;

        try {
            astolforocks = new API(new URI("https://astolfo.rocks/api/v1/images/random").toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        JSONObject json = astolforocks.getJson();

        int id = json.getInt("id");
        String type = json.getString("file_extension");

        Download.image(id, type);
        System.out.println(id + "\n" + type);

    }
}
