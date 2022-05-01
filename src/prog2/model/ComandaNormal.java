package prog2.model;

/**
 * Class of normal order
 * @author eshaan
 * @author alex
 */
public class ComandaNormal extends Comanda {
    /**
     * Constructor
     * @param client      the client
     * @param article     the article
     * @param numArticles the num articles
     */
    public ComandaNormal(Client client, Article article, int numArticles) {
        super(client, article, numArticles);
    }

    @Override
    public String tipusComanda() {
        return "Normal";
    }

    @Override
    public boolean comandaEnviada() {

        return false;
    }

    @Override
    public boolean comandaRebuda() {

        return false;
    }

    @Override
    public float preuEnviament() {
        return 1;
    }
}
