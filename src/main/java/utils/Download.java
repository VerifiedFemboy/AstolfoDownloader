package utils;

public class Download {

    static boolean isDone = true;
    static boolean isFileExists = true;

    public static void image(String url, String path, String name, String type){
        NetworkingUtils.download(url, path + "/" + name + "." + type);
    }

    public static void image(String url, String path){
        NetworkingUtils.download(url, path);
        System.out.println(path);
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
