package exception;

public class UnknownCommandException extends Exception {
    public UnknownCommandException() {
    }

    public UnknownCommandException(String message) {
        super(message);
    }
}
