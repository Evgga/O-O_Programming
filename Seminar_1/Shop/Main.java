//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

package Home;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop pyatecrestok = new Shop("Пятекресток");
        Product smartphone1 = new Product("DEXP", 10699, 6.1);
        Product smartphone2 = new Product("BQ", 12999, 7.5);
        Product smartphone3 = new Product("INOI", 9999, 4.5);
        Product notebook1 = new Product("Irbis", 15999, 6.7);
        Product notebook2 = new Product("Digma", 17699, 8.5);
        Product notebook3 = new Product("Chuwi", 18999, 7.3);
        Product monoblock1 = new Product("PrimeBox", 35999, 8.1);
        Product monoblock2 = new Product("ASUS", 32999, 7.2);
        Product monoblock3 = new Product("Rombica", 27999, 6.1);
        pyatecrestok.addProduct(smartphone1);
        pyatecrestok.addProduct(smartphone2);
        pyatecrestok.addProduct(smartphone3);
        pyatecrestok.addProduct(notebook1);
        pyatecrestok.addProduct(notebook2);
        pyatecrestok.addProduct(notebook3);
        pyatecrestok.addProduct(monoblock1);
        pyatecrestok.addProduct(monoblock2);
        pyatecrestok.addProduct(monoblock3);
        CategoryProduct smartphone = new CategoryProduct("Smartphone");
        smartphone.addProduct(smartphone1);
        smartphone.addProduct(smartphone2);
        smartphone.addProduct(smartphone3);
        CategoryProduct notebook = new CategoryProduct("Notebook");
        notebook.addProduct(notebook1);
        notebook.addProduct(notebook2);
        notebook.addProduct(notebook3);
        CategoryProduct monoblock = new CategoryProduct("Monoblock");
        monoblock.addProduct(monoblock1);
        monoblock.addProduct(monoblock2);
        monoblock.addProduct(monoblock3);
        User user1 = new User("Ivan99", "qwe789");
        User user2 = new User("Alex94", "qwe456");
        User user3 = new User("Petr93", "qwe123");
        List<Product> products = pyatecrestok.getCatalog();
        System.out.println(products);
        user1.buy(smartphone1, pyatecrestok);
        List<Product> user1Buy = user1.getBasket();
        System.out.println("user1Buy = " + user1Buy);
        user2.buy(monoblock2, pyatecrestok);
        List<Product> user2Buy = user2.getBasket();
        System.out.println("user2Buy = " + user2Buy);
        user3.buy(notebook3, pyatecrestok);
        List<Product> user3Buy = user3.getBasket();
        System.out.println("user3Buy = " + user3Buy);
        products = pyatecrestok.getCatalog();
        System.out.println(products);
    }
}
