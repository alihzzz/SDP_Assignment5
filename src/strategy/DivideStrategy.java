package strategy;

public class DivideStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return a / b;
    }
}