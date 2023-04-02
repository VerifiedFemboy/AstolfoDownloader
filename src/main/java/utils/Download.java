package utils;

public class Download {

    public static void image(int id, String type){
        String url = "https://astolfo.rocks/astolfo/" + id + "." + type;
        NetworkingUtils.openLink(url);
    }
}
