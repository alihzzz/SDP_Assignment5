import context.Calculator;
import strategy.AddStrategy;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;
import strategy.DivideStrategy;

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Add: " + a + " + " + b + " = " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtract: " + a + " - " + b + " = " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiply: " + a + " * " + b + " = " + calculator.calculate(a, b));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Divide: " + a + " / " + b + " = " + calculator.calculate(a, b));
    }
}