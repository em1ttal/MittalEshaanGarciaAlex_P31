package prog2.vista;

/**
 * Class to handle exceptions
 * @author eshaan
 * @author alex
 */
public class MercatException extends Throwable {
    private String errorMessage;

    /**
     * Instantiates a new Mercat exception.
     */
    public MercatException() {
        super();
    }

    /**
     * Instantiates a new Mercat exception.
     * @param errorMessage the error message
     */
    public MercatException(String errorMessage) {
        super(errorMessage);
    }
}