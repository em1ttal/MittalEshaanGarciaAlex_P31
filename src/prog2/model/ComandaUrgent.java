package prog2.model;

/**
 * Class of urgent order
 * @author eshaan
 * @author alex
 */
public class ComandaUrgent extends Comanda {
    /**
     * Constructor
     * @param client      the client
     * @param article     the article
     * @param numArticles the num articles
     */
    public ComandaUrgent(Client client, Article article, int numArticles) {
        super(client, article, numArticles);
    }

    @Override
    public String tipusComanda() {
        return "Urgent";
    }

    @Override //TODO
    public boolean comandaEnviada() {
        return false;
    }

    @Override //TODO
    public boolean comandaRebuda() {
        return false;
    }

    @Override
    public float preuEnviament() {
        return 4;
    }
}
