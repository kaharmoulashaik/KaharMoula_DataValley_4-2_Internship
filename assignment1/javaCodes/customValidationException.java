import java.util.*;

class customValidationException extends Exception {
    public customValidationException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            validateNumber(number);
            System.out.println("Number is valid.");
        } catch (customValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateNumber(int number) throws customValidationException {
        if (number < 0) {
            throw new customValidationException("Number cannot be negative");
        }
    }
}
