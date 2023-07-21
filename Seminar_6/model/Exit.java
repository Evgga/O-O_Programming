package Seminar_6.model;

import Seminar_6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Exit extends Model {
    public Exit(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        warehouse.export();
        System.out.println("выход...");
        System.exit(0);
    }
}
