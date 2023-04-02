package utils;

public class Download {

    public static void image(String url, String path, String name, String type){
//        NetworkingUtils.openLink(url);
        NetworkingUtils.download(url, path + "/" + name + "." + type);
    }
}
