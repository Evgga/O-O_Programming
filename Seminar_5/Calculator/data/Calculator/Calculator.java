package Seminar_5.Calculator.data.Calculator;

public abstract class Calculator<N> {
    protected N numOne;
    protected N numTwo;
    protected char operation;

    public char getOperation() {
        return operation;
    }

    public N getNumOne() {
        return numOne;
    }

    public N getNumTwo() {
        return numTwo;
    }
}
