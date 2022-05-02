package prog2.model;

import java.util.Date;

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
        Date act = new Date();
        Date cre = getDateCreation();
        return ((act.getTime() - cre.getTime()) > ((long) getArticle().getTimeToShip() * 60 * 1000));
    }

    @Override //TODO
    public boolean comandaRebuda() {
        Date act = new Date();
        Date cre = getDateCreation();
        return ((act.getTime() - cre.getTime()) > (24 * 60 * 60 * 1000));
    }

    @Override
    public float preuEnviament() {
        return 4;
    }
}
