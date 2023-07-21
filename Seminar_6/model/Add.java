package Seminar_6.model;

import Seminar_6.data.Product;
import Seminar_6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Add extends Model {
    public Add(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println("Введите новый продукт\n <id name amount price>");
        String[] temp = scanner.next().strip().split(" ");
        Product product = new Product(
                Integer.parseInt(temp[0]),
                temp[1],
                Integer.parseInt(temp[2]),
                Double.parseDouble(temp[3])
        );
        boolean flag = true;
        for (Product wProd : warehouse.getProducts()) {
            if (wProd.equals(product)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            warehouse.addProduct(product);
        } else System.out.println("такой id есть, выход в меню");
    }
}
