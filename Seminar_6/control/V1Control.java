package Seminar_6.control;

import Seminar_6.data.warehouse.Warehouse;
import Seminar_6.model.Model;

import java.util.Scanner;

public class V1Control implements Control {
    private final Model[] models;
    private Warehouse warehouse;

    public V1Control(Warehouse warehouse, Model... models) {
        this.warehouse = warehouse;
        this.models = models;
    }

    @Override
    public void onExecute(int item, Scanner in) {
        models[item].execute(warehouse, in);
    }

    @Override
    public int size() {
        return models.length;
    }

    @Override
    public String toString() {
        StringBuilder main = new StringBuilder();
        main.append("\n----------MENU----------\n")
                .append("Выберите пункт меню для\n")
                .append("взаимодействия с системой\n")
                .append("управления складом:\n");
        for (int i = 0; i < models.length; i++) {
            main.append("[")
                    .append(i + 1)
                    .append("] ")
                    .append(models[i].getNameMenu())
                    .append("\n");
        }
        return main.toString();
    }
}
