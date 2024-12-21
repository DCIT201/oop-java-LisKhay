package exceptions;

// Custom exception class for rental-specific errors
public class RentalException extends Exception {
    // Constructor accepting a message
    public RentalException(String message) {
        super(message);
    }
}
