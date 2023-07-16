package Seminar_5.Calculator.model;

import Seminar_5.Calculator.data.Calculator.Calculator;

public abstract class Model <N extends Calculator<E>, E> {
    public abstract E calculate(N calculator);
}
