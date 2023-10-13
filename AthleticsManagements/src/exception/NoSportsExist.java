package exception;

public class NoSportsExist extends Exception {
    public NoSportsExist() {
    }

    public NoSportsExist(String message) {
        super(message);
    }

    public NoSportsExist(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSportsExist(Throwable cause) {
        super(cause);
    }

    public NoSportsExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
