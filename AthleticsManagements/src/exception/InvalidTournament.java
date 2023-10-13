package exception;

public class InvalidTournament extends Exception {
    public InvalidTournament() {
    }

    public InvalidTournament(String message) {
        super(message);
    }

    public InvalidTournament(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTournament(Throwable cause) {
        super(cause);
    }

    public InvalidTournament(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
