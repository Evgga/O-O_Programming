package Seminar_5.Calculator.data.OperationComplex;

import Seminar_5.Calculator.data.Complex;

public class ComplexDiff {
    public Complex diff(Complex a, Complex b) {
        double real = a.getRe() - b.getRe();
        double img = a.getIm() - b.getIm();
        return new Complex(real, img);
    }
}
