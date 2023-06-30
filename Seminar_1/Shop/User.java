package Home;

import java.util.List;
public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public List<Product> getBasket() {
        return basket.getCatalog();
    }

    public void buy(Product product, Shop shop) {
        basket.addProduct(product);
        shop.removeProduct(product);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
