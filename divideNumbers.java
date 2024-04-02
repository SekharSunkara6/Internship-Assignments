public class DivisionProgram {
    public static void main(String[] args) {
        divideNumbers(10, 2);
        divideNumbers(10, 0); // This will throw an ArithmeticException
    }

    public static void divideNumbers(int numerator, int denominator) {
        try {
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch ArithmeticException if denominator is zero
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}



Output:
Result of division: 5
ERROR!
Error: Division by zero is not allowed.
