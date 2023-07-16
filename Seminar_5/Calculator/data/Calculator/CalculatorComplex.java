package Seminar_5.Calculator.data.Calculator;

import Seminar_5.Calculator.data.Complex;

public class CalculatorComplex extends Calculator<Complex> {
    public CalculatorComplex(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                String[] complex = temp.strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                super.numOne = new Complex(re, im);
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        super.numTwo = new Complex(re, im);
    }

    public CalculatorComplex(Complex num, String in) {
        super.numOne = num;
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        super.numTwo = new Complex(re, im);
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}
