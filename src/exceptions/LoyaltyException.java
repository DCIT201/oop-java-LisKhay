package exceptions;

// Custom exception class that extends the Exception class
public class LoyaltyException extends Exception {
    // Constructor accepting a message
    public LoyaltyException(String message) {
        super(message);
    }
}
