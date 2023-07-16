package Seminar_5.Calculator.data.Calculator;

public class CalculatorRational extends Calculator<Double> {
    public CalculatorRational(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                this.numOne = Double.parseDouble(temp.strip());
                temp = "";
            } else temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }
    public CalculatorRational(double numOne, String in) {
        this.numOne = numOne;
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        this.numTwo = Double.parseDouble(temp.strip());
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}
