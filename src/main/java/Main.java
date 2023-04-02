import utils.API;

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

        System.out.println(astolforocks.getJson().getInt("id"));
    }
}
