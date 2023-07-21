package hw4;
import java.util.List;

public class Calculator {
    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int multiply(List<Integer> numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }

    public String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}