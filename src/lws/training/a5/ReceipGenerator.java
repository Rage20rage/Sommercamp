package lws.training.a5;

import java.io.IOException;

public class ReceipGenerator {

    public static double sume;

    public static void genereate() {
        for(int i = 0; i <=100; i++) {
            System.out.println("");
        }
        if(RunA5.articleList.isEmpty()) {
            System.out.println("Es wurden keine Artikel gekauft!");
        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("                 -Recipe-                ");
            System.out.println("");
            for(Article article : RunA5.articleList) {
                String spacer = "";
                for(int linelength = (article.getName() + article.getPrice()).length(); linelength <= 40; linelength++) {
                    spacer = spacer +" ";
                }
                for(int i = article.getCount(); i > 0; i--) {
                    sume = sume + article.getPrice();
                    System.out.println(article.getName() + spacer + article.getPrice() + "€");
                }
            }
            System.out.println("");
            String spacer = "";
            for(int linelength = ("Total" + sume).length(); linelength <= 40; linelength++) {
                spacer = spacer +" ";
            }
            System.out.println("Total" + spacer + sume + "€");
        }
    }

}
