package Home;

import java.util.LinkedList;
import java.util.List;

public class CategoryProduct extends Shop {

    public CategoryProduct(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "\n" + getName() + ": " + super.getCatalog();
    }
}
