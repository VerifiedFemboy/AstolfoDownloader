import utils.API;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args){
        try {
            API astolforocks = new API(new URI("https://astolfo.rocks/api/v1/images/random").toURL());
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
