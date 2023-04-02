package utils;

import java.util.Random;

public class StringUtils {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String random(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 5; i++){
            int index = random.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(index));
        }
        return stringBuilder.toString();
    }
}
