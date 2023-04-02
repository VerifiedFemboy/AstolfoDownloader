import apis.AstolfoRocks;
import apis.WaifuPics;
import utils.Download;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        do {
            if(!Download.isDone() && !Download.isFileExists())
                continue;

            System.out.println("Choose website do you want have a random image: \n[1] astolfo.rocks\n[2] waifu.pics");

            Scanner scanner = new Scanner(System.in);

            String webSite = scanner.next();

            switch (webSite){
                case "1":
                    AstolfoRocks.download();
                    break;
                case "2":
                    WaifuPics.download();
                    break;
            }

        }while (true);
    }
}
