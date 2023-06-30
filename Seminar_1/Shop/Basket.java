package Home;

import java.util.LinkedList;
import java.util.List;
public class Basket extends Shop {
    public Basket(List<Product> product) {
        super.setCatalog(product);
    }

    public Basket() {
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "Basket{" + getCatalog() + '}';
    }
}
