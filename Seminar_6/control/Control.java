package Seminar_6.control;

import java.util.Scanner;

public interface Control {

    /**
     * Open-closed principle открыт для расширения другими версиями control, закрыт для модификаций
     */
    public void onExecute(int item, Scanner scanner);
    public int size();
}
