package lws.training.a5;

import java.io.IOException;
import java.util.Scanner;

import static lws.training.a5.RunA5.articleList;

public class UserInput {

    public static void startuserinput() {
        System.out.println("Du kannst bei der Eingabe des Namens \"end\" oder \"stop\" schreiben um den Kassenbong zu generieren!");
        System.out.println("Loading...");
        try { Thread.sleep(2000); } catch(Exception e) {e.printStackTrace();}
        boolean resume = true;
        while (resume) {
            for(int i = 0; i <=100; i++) {
                System.out.println("");
            }
            Scanner sc;
            System.out.print("Bitte gebe den Name des Artikels ein: ");
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("stop") || name.equalsIgnoreCase("end"))  {
                System.out.println("Generriere Kassenbong...");
                ReceipGenerator.genereate();
                resume = false;
            } else {
                System.out.print("Bitte gebe den Preis des Artikels ein: ");
                sc = new Scanner(System.in);
                double price = sc.nextDouble();
                System.out.print("Bitte gebe die Anzahl des Artikels ein: ");
                sc = new Scanner(System.in);
                int count = sc.nextInt();
                registerArticle(name, price, count);
            }
            }
    }

    public static void registerArticle(String name, double price, int count) {
        boolean needlistadd = true;
        Article article = new Article(name, price, count);
        for (Article articleInList : articleList) {
            if (article.getName().equals(articleInList.getName())) {
                articleInList.addCount(article.getCount(), price);
                needlistadd = false;
            }
        }
        if(needlistadd) articleList.add(article);
    }

}
