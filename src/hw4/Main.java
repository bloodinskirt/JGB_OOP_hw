package hw4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Сумма: " + sumResult);

        int multiplyResult = calculator.multiply(Arrays.asList(2, 3, 4));
        System.out.println("Произведение: " + multiplyResult);

        int divideResult = calculator.divide(10, 2);
        System.out.println("Результат деления: " + divideResult);

        String binaryResult = calculator.toBinary(10);
        System.out.println("Бинарное представление числа: " + binaryResult);
    }
}