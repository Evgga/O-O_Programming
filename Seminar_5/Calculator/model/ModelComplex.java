package Seminar_5.Calculator.model;

import Seminar_5.Calculator.data.Calculator.CalculatorComplex;
import Seminar_5.Calculator.data.Complex;
import Seminar_5.Calculator.data.OperationComplex.*;

public class ModelComplex extends Model<CalculatorComplex, Complex> {
    @Override
    public Complex calculate(CalculatorComplex calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().sum(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().diff(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().div(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().multi(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
