package prog2.model;
import java.io.Serializable;
import java.util.Date;

/**
 * Class of commands
 * @author eshaan
 * @author alex
 */
public abstract class Comanda implements Serializable {
    /**
     * Client
     */
    private Client client = null;
    /**
     * Article
     */
    private Article article = null;
    /**
     * Number of articles
     */
    private int numArticles;
    /**
     * Date and time of order
     */
    private Date date = new Date();
    /**
     * String of date and time
     */
    private String date_time;
    /**
     * Price of normal order
     */
    private float costN = 1;
    /**
     * Price of urgent order
     */
    private float costU = 4;

    /**
     * Constructor
     * @param client      client
     * @param article     article
     * @param numArticles number of articles
     */
    public Comanda(Client client, Article article, int numArticles) {
        this.client = client;
        this.article = article;
        this.numArticles = numArticles;
        this.date_time = date.toString();
    }

    /**
     * Calculates price
     * @return price float
     */
    public float calcPreu(){
       return article.getPrice() * this.numArticles;
    }

    /**
     * Type of order
     * @return order type
     */
    public abstract String tipusComanda();

    /**
     * Has order been sent?
     * @return sent ?
     */
    public abstract boolean comandaEnviada();

    /**
     * Has order been received?
     * @return received ?
     */
    public abstract boolean comandaRebuda();

    /**
     * Shipping price
     * @return price float
     */
    public abstract float preuEnviament();

    /**
     * Puts order information into one string
     * @return order information
     */
    public String toString(){
        return "Tipus: " + tipusComanda() + ", Article: " + article.getName() +
                ", Client: " + client.getName() + ", Quantitat: "  + numArticles +
                ", Data de creacio: " + date_time + ", Enviat: " + comandaEnviada() +
                ", Rebuda: " + comandaRebuda() + ", Preu: " + calcPreu() +
                "€, Preu Enviament: " + preuEnviament() + "€";
    }

    /**
     * Gets client
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets client
     * @param client the client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Gets article
     * @return the article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets article
     * @param article the article
     */
    public void setArticle(Article article) {
        this.article = article;
    }

    /**
     * Gets number of articles
     * @return the num articles
     */
    public int getNumArticles() {
        return numArticles;
    }

    /**
     * Sets number of articles
     * @param numArticles the number of articles
     */
    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }
}
