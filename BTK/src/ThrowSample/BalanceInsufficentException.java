package ThrowSample;

public class BalanceInsufficentException extends Throwable {
    String message;

    public BalanceInsufficentException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
