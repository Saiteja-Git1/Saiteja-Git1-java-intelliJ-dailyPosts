package daySix;
// Define the custom exception
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message); // Pass the message to the Exception class constructor
    }
}

// Main class
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateInput(10); // Test with invalid input
        } catch (InvalidInputException e) { // Catch the custom exception
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }

    // Method to validate input
    public static void validateInput(int number) throws InvalidInputException {
        if (number < 0) { // Check for invalid input
            throw new InvalidInputException("Input must be a positive number!"); // Throw custom exception
        }
        System.out.println("Valid input: " + number); // Handle valid input
    }
}
