package Seminar_6.model;

import Seminar_6.data.warehouse.Warehouse;

import java.util.Scanner;

public abstract class Model {
    /**
     * Single responsibility principle декомпозиция методов, используя паттерн Команда
     */
    protected String nameMenu;

    public Model(String nameMenu) {
        this.nameMenu = nameMenu;
    }

    public abstract void execute(Warehouse warehouse, Scanner scanner);

    public String getNameMenu() {
        return nameMenu;
    }

    @Override
    public String toString() {
        return nameMenu;
    }
}
