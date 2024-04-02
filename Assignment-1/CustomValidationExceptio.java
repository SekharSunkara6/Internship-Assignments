class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int number = -5;

        try {
            validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (CustomValidationException e) {
            System.out.println("Custom Validation Exception: " + e.getMessage());
        }
    }
  
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}
