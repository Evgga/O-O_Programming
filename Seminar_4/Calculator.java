package Seminar_4;

import java.util.List;

public class Calculator <N>{
    public double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double div(List<? extends Number> numbers) {
        double div = 1.0;
        for (Number number : numbers) {
            div /= number.doubleValue();
        }
        return div;
    }

    public double multiply(List<? extends Number> numbers) {
        double multi = 1.0;
        for (Number number : numbers) {
            multi *= number.doubleValue();
        }
        return multi;
    }

    public String binaryTranslation(List<N> numbers) {
        StringBuilder result = new StringBuilder();
        for (N number : numbers) {
            result.append(toBinary(number));
            result.append(" ");
        }
        return result.toString();
    }

    public String toBinary(N d) {
        int precision = 10;
        double temp = Double.parseDouble("" + d);
        int wholePart = (int) temp;
        if (temp - wholePart == 0) return wholeToBinary(wholePart);
        else return wholeToBinary(wholePart) + '.' + fractionalToBinary(temp - wholePart, precision);
    }

    private String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }

    private String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }
}
