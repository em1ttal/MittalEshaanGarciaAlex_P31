package prog2.model;

import prog2.vista.MercatException;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class that communicates with Adaptador.java
 * @author eshaan
 * @author alex
 */
public class Dades implements InDades, Serializable {
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
    public Dades(){
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
     * Adds all articles to an ArrayList
     * @return ArrayList
     */
    @Override
    public ArrayList<Article> recuperaArticles() {
        ArrayList<Article> articles = new ArrayList<>();
        for(Article a : llistaArticles.getArrayList())
            articles.add(a);
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

    /**
     * Adds all clients to an ArrayList
     * @return ArrayList
     */
    @Override
    public ArrayList<Client> recuperaClients() {
        ArrayList<Client> clients = new ArrayList<>();
        for(Client c : llistaClients.getArrayList())
            clients.add(c);
        return clients;
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
        if(articlePos > llistaArticles.getSize()) throw new MercatException("Esta posicion de articulo no existe");
        if(clientPos > llistaClients.getSize()) throw new MercatException("Esta posicion de cliente no existe");

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

    /**
     * Removes order from list of orders
     * @param position
     * @throws MercatException
     */
    @Override
    public void esborrarComanda(int position) throws MercatException {
        if(llistaComandes.isEmpty()) throw new MercatException("Llista de pedidos esta vacia");
        else if(llistaComandes.getSize() < position) throw new MercatException("No existe un pedido en esta posicion.");

        llistaComandes.esborrar(llistaComandes.getAt(position - 1));
    }

    /**
     * Adds all orders to an ArrayList
     * @return ArrayList
     */
    @Override
    public ArrayList<Comanda> recuperaComandes() {
        ArrayList<Comanda> orders = new ArrayList<>();
        for(Comanda c : llistaComandes.getArrayList())
            orders.add(c);
        return orders;
    }

    /**
     * Adds urgent orders to an ArrayList
     * @return ArrayList
     */
    @Override
    public ArrayList<Comanda> recuperaComandesUrgents() {
        ArrayList<Comanda> urgentOrders = new ArrayList<>();
        for(Comanda c : llistaComandes.getArrayList()) {
            if(c.tipusComanda().equalsIgnoreCase("Urgent"))
                urgentOrders.add(c);
        }
        return urgentOrders;
    }
}
