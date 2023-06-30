package Home;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private String name;
    private int price;
    private double rating;

    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n(" + name + ", цена: " + price + " рублей" + ", рейтинг: " + rating + ')';
    }
}
