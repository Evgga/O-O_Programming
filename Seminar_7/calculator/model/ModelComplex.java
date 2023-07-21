package Seminar_7.calculator.model;

import Seminar_7.calculator.data.Calculator;
import Seminar_7.calculator.data.Complex;
import Seminar_7.calculator.data.ComplexDiff;
import Seminar_7.calculator.data.ComplexDiv;
import Seminar_7.calculator.data.ComplexMulti;
import Seminar_7.calculator.data.ComplexSum;

public class ModelComplex implements Model {
    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
