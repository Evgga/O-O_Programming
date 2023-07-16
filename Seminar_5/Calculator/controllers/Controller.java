package Seminar_5.Calculator.controllers;

import Seminar_5.Calculator.data.Calculator.CalculatorComplex;
import Seminar_5.Calculator.data.Calculator.CalculatorRational;
import Seminar_5.Calculator.data.Complex;
import Seminar_5.Calculator.model.ModelComplex;
import Seminar_5.Calculator.model.ModelRational;

public class Controller {
    public Controller() {}

    public double sendRational(CalculatorRational calculator) {
        ModelRational model = new ModelRational();
        return model.calculate(calculator);
    }

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
