package utils;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class API {
    URL url;

    public API(URL url){
        this.url = url;
    }

    public static JSONObject getJson(URL url) {
        String json = null;
        try {
            json = IOUtils.toString(url, Charset.forName("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new JSONObject(json);
    }
}
