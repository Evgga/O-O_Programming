package Seminar_6.data;

public class Product {
    private int id;
    private String name;
    private Integer amount;
    private Double price;

    public Product(int id, String name, Integer amount, Double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    public void decreaseQuantity(int amount) {
        if (this.amount < amount) System.out.println("невозможно уменьшить");
        else this.amount -= amount;
    }

    public void increaseQuantity(int amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "\n id " + id + ", " + name + ", количество " + amount + ", цена " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
}
