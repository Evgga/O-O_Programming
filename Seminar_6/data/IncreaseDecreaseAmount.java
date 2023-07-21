package Seminar_6.data;

import Seminar_6.data.Product;

public interface IncreaseDecreaseAmount {
    /**
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    public Product increase(Product product, int amount);
    public Product decrease(Product product, int amount);
}
