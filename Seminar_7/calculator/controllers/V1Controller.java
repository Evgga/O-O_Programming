package Seminar_7.calculator.controllers;

import Seminar_7.calculator.data.CalculatorComplex;
import Seminar_7.calculator.data.Complex;
import Seminar_7.calculator.model.ModelComplex;

public class V1Controller implements Controller {
    public V1Controller() {}

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
