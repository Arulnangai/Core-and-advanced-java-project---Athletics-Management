package exception;

public class TournamentAlreadyExists extends Exception {
    public TournamentAlreadyExists() {
    }

    public TournamentAlreadyExists(String message) {
        super(message);
    }

    public TournamentAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }

    public TournamentAlreadyExists(Throwable cause) {
        super(cause);
    }

    public TournamentAlreadyExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
