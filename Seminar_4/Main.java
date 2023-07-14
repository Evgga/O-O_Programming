package Seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.0, 5.5, 6.6, 7.7, 8.8, 9.9));
        List<String> listString = new ArrayList<>(Arrays.asList("1.5", "2.9", "3.1", "4", "5.4524", "6"));

        System.out.println("Сумма = " + calculator.sum(listInt));
        System.out.println("Деление = " + calculator.div(listInt));
        System.out.println("Умножение = " + calculator.multiply(listInt));

        System.out.println("Сумма = " + calculator.sum(listDouble));
        System.out.println("Деление = " + calculator.div(listDouble));
        System.out.println("Умножение = " + calculator.multiply(listDouble));

        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listInt));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listDouble));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listString));
    }
}
