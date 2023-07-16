package Seminar_5.Calculator.data.OperationComplex;

import Seminar_5.Calculator.data.Complex;

public class ComplexSum {
    public Complex sum(Complex a, Complex b) {
        double real = a.getRe() + b.getIm();
        double img = a.getIm() + b.getIm();
        return new Complex(real, img);
    }
}
