package Seminar_6.model;

import Seminar_6.data.Product;
import Seminar_6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Order extends Model {
    public Order(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.print("Введите id продукта: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("в обработку? Y/N ");
                String in = scanner.next().toUpperCase();
                if (in.equals("Y")) {
                    System.out.print("количество: ");
                    warehouse.decrease(product, scanner.nextInt());
                    System.out.println("обработка заказа...");
                } else System.out.println("уже идет обработка заказа");
            }
        }
    }
}
