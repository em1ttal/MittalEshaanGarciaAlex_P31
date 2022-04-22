package prog2.model;
import prog2.vista.MercatException;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that communicates with Adaptador.java
 * @author eshaan
 * @author alex
 */
public class Dades implements InDades {
    /**
     * Article list
     */
    private LlistaArticles llistaArticles;
    /**
     * Client list
     */
    private LlistaClients llistaClients;
    /**
     * Order list
     */
    private LlistaComandes llistaComandes;

    /**
     * Constructor
     */
    Dades(){
        llistaArticles = new LlistaArticles();
        llistaClients = new LlistaClients();
        llistaComandes = new LlistaComandes();
    }

    /**
     * Creates article
     * Adds article to article list
     * @param id
     * @param nom
     * @param preu
     * @param temps
     * @param admetUrgent
     * @throws MercatException
     */
    @Override
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {
        Article article = new Article(id, nom, preu, admetUrgent, temps);
        llistaArticles.afegir(article);
    }

    /**
     * Adds all articles to a List<String>
     * @return List
     */
    @Override
    public List<String> recuperaArticles() {
        List<String> articles = new ArrayList<>();
        ArrayList<Article> a = llistaArticles.getArrayList();
        for(Article article : a)
            articles.add(a.toString());
        return articles;
    }

    /**
     * Creates standard/premium client
     * Adds client to client list
     * @param email
     * @param nom
     * @param adreca
     * @param esPremium
     * @throws MercatException
     */
    @Override
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {
        if(!esPremium) {
            ClientEstandard clientEstandard = new ClientEstandard(nom, email, adreca);
            llistaClients.afegir(clientEstandard);
        } else {
            ClientPremium clientPremium = new ClientPremium(nom, email, adreca);
            llistaClients.afegir(clientPremium);
        }
    }

    @Override
    public List<String> recuperaClients() {
        return null;
    }

    /**
     * Creates normal/urgent order
     * Adds order to order list
     * @param articlePos
     * @param clientPos
     * @param quantitat
     * @param esUrgent
     * @throws MercatException
     */
    @Override
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {
        Article a = llistaArticles.getAt(articlePos);
        Client c = llistaClients.getAt(clientPos);
        if(esUrgent) {
            ComandaUrgent comandaUrgent = new ComandaUrgent(c, a, quantitat);
            llistaComandes.afegir(comandaUrgent);
        } else {
            ComandaNormal comandaNormal = new ComandaNormal(c, a, quantitat);
            llistaComandes.afegir(comandaNormal);
        }
    }

    @Override
    public void esborrarComanda(int position) throws MercatException {

    }

    @Override
    public List<String> recuperaComandes() {
        return null;
    }

    @Override
    public List<String> recuperaComandesUrgents() {
        return null;
    }
}
