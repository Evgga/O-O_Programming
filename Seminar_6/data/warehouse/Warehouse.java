package Seminar_6.data.warehouse;

import Seminar_6.data.AddDeleteProduct;
import Seminar_6.data.IncreaseDecreaseAmount;
import Seminar_6.data.Product;

import java.util.List;

public abstract class Warehouse implements AddDeleteProduct, IncreaseDecreaseAmount {
    /**
     * Liskov substitution principle можно заменить его реализацией и все будет работать
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = products;
    }

    public Warehouse() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> setProducts(List<Product> products) {
        this.products = products;
        return products;
    }

    public abstract void export();

    @Override
    public String toString() {
        return products + "\n";
    }
}
