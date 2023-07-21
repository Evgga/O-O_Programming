package Seminar_6.model;

import Seminar_6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Show extends Model {
    public Show(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println(warehouse);
    }
}
