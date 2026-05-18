package ejercicio2;

public class InvalidPageException extends RuntimeException {
    public InvalidPageException(String errorMessage) {
        super(errorMessage);
    }
}
