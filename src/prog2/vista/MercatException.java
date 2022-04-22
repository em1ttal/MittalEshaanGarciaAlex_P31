package prog2.vista;
/**
 * Class to handle exceptions
 * @author eshaan
 * @author alex
 */
public class MercatException extends Throwable {
    private String errorMessage;

    public MercatException() {
        super();
    }
    public MercatException(String errorMessage) {
        super(errorMessage);
    }
}