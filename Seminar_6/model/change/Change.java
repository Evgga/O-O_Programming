package Seminar_6.model.change;

import Seminar_6.control.*;
import Seminar_6.data.warehouse.Warehouse;
import Seminar_6.model.Model;
import Seminar_6.view.*;

import java.util.Scanner;

public class Change extends Model {
    protected final View view;
    public Change(String nameMenu, View view) {
        super(nameMenu);
        this.view = view;
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        Control sub = new V1Control(warehouse,
                new Increase("Увеличение количества"),
                new Decrease("Уменьшение количества"),
                new Return("Назад", view));
        new V1View(sub);
    }
}
