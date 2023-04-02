package utils;

public class Download {

    static boolean isDone = true;
    static boolean isFileExists = true;

    public static void image(String url, String path, String name, String type){
//        NetworkingUtils.openLink(url);
        setDone(false);
        setFileExists(false);
        NetworkingUtils.download(url, path + "/" + name + "." + type);


    }

    public static boolean isFileExists(){
        return isFileExists;
    }

    public static void setFileExists(boolean isFileExists) {
        Download.isFileExists = isFileExists;
    }

    public static boolean isDone() {
        return isDone;
    }

    public static void setDone(boolean done) {
        isDone = done;
    }
}
