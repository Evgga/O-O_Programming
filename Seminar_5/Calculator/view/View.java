package Seminar_5.Calculator.view;

import Seminar_5.Calculator.controllers.Controller;
import Seminar_5.Calculator.data.Calculator.CalculatorComplex;
import Seminar_5.Calculator.data.Calculator.CalculatorRational;
import Seminar_5.Calculator.data.Complex;
import Seminar_5.Calculator.data.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class View {
    private final Controller controller = new Controller();
    private Status status = Status.FIRST;

    private List<Log> logging = new ArrayList<>();
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");;
        System.out.println("""
                _________________________________________
                Выберите с каким числами хотите работать:\s
                [1]- рациональные числа
                [2]- комплексные числа
                [C]- для выхода""");
        String key = in.next().strip().toLowerCase();
        switch (key) {
            case "1" -> {
                partRational(in);
            }
            case "2" -> {
                partComplex(in);
            }
            default -> {
                in.close();
            }
        }
    }

    public void partRational(Scanner in) {
        System.out.println("""
                ______________RATIONAL_NUMBER______________
                ИНСТУКЦИЯ:
                значения вводите в формате:\s
                <Число СимволОперации Число>""");
        String key = in.next().toLowerCase();
        CalculatorRational calculator;
        double result = 0;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorRational(key);
                status = Status.NEXT;
            } else calculator = new CalculatorRational(result, key);
            result = controller.sendRational(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result);
            key = in.next().toLowerCase();
        }
        in.nextLine();
        loggingGame(in, logging);
    }
    public void partComplex(Scanner in) {
        System.out.println("""
                ______________COMPLEX_NUMBER______________
                ИНСТУКЦИЯ:
                значения вводите в формате:\s
                <Действительное Мнимое СимволОперации Действительное Мнимое>""");
        String key = in.next().toLowerCase();
        CalculatorComplex calculator;
        Complex result = null;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new CalculatorComplex(key);
                status = Status.NEXT;
            } else calculator = new CalculatorComplex(result, key);
            result = controller.sendComplex(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result);
            key = in.next().toLowerCase();
        }
        in.nextLine();
        loggingGame(in, logging);
    }

    private static void loggingGame(Scanner scanner, List<Log> logging) {
        System.out.print("Хотите посмотреть логи? Y/N: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Y")) {
            for (Log log : logging) {
                System.out.println(log);
            }
        }
    }
}
