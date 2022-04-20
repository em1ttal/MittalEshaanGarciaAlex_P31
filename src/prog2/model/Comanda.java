package prog2.model;
import java.util.Date;

/**
 * Class of commands
 * @author eshaan
 * @author alex
 */
public class Comanda {
    /**
     * Date and time of command
     */
    private Date date = new Date();
    /**
     * Client
     */
    private Client c = null;
    /**
     * Article
     */
    private Article a = null;
    /**
     * Number of articles that are the same
     */
    private int numSameArticleType;

    Comanda(){
    }

    /**
     * Gets date and time
     * @return date and time
     */
    public String getTime() {
        return date.toString();
    }
}
