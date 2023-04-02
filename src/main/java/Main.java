import apis.AstolfoRocks;
import apis.CatApi;
import apis.NekosLife;
import apis.WaifuPics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Choose website do you want have a random image: \n[1] astolfo.rocks\n[2] waifu.pics\n[3] nekos.life\n[4] cute cats");

        Scanner scanner = new Scanner(System.in);

        String webSite = scanner.next();

        switch (webSite){
            case "1":
                AstolfoRocks.download();
                break;
            case "2":
                WaifuPics.download();
                break;
            case "3":
                NekosLife.download();
                break;
            case "4":
                CatApi.download();
                break;
        }

        /*do {
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

        }while (true);*/
    }
}
