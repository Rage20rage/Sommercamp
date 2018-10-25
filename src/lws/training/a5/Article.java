package lws.training.a5;

public class Article {

    private String name;
    private double price;
    private int count;

    public Article(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }


    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count, double price) {
        this.count = count + this.count;
        this.price = price;
    }

}
