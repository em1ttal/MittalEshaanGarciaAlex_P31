package prog2.adaptador;

import prog2.model.*;
import prog2.vista.MercatException;

import java.util.ArrayList;

/**
 * Class to join model and vista
 * @author eshaan
 * @author alex
 */
public class Adaptador {
    /**
     * Data
     */
    private Dades dades;

    /**
     * Constructor
     */
    public Adaptador(){
        dades = new Dades();
    }

    /**
     * Passes article parameters to Dades.java
     * @param id
     * @param nom
     * @param preu
     * @param temps
     * @param admetUrgent
     * @throws MercatException
     */
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException{
        dades.afegirArticle(id, nom, preu, temps, admetUrgent);
    }

    /**
     * Recovers article list from Dades.java
     * @return String of article list
     */
    public String recuperaArticles(){
        StringBuilder s = new StringBuilder();
        ArrayList<Article> a = dades.recuperaArticles();
        for(Article article : a)
            s.append(article.toString()).append("\n");
        return s.toString();
    }

    /**
     * Passes client parameters to Dades.java
     * @param email
     * @param nom
     * @param adreca
     * @param esPremium
     * @throws MercatException
     */
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException{
        dades.afegirClient(email, nom, adreca, esPremium);
    }

    /**
     * Recovers client list from Dades.java
     * @return String of client list
     */
    public String recuperaClients(){
        StringBuilder s = new StringBuilder();
        ArrayList<Client> c = dades.recuperaClients();
        for(Client client : c)
            s.append(client.toString()).append("\n");
        return s.toString();
    }

    /**
     * Passes order parameters to Dades.java
     * @param articlePos
     * @param clientPos
     * @param quantitat
     * @param esUrgent
     * @throws MercatException
     */
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException{
        dades.afegirComanda(articlePos, clientPos, quantitat, esUrgent);
    }

    /**
     * Passes position of order to remove
     * @param pos
     * @throws MercatException
     */
    public void esborrarComanda(int pos) throws MercatException{
        dades.esborrarComanda(pos);
    }

    /**
     * Recovers all order list from Dades.java
     * @return String of orders
     */
    public String recuperaComanda(){
        StringBuilder s = new StringBuilder();
        ArrayList<Comanda> c = dades.recuperaComandes();
        for(Comanda comanda : c)
            s.append(comanda.toString()).append("\n");
        return s.toString();
    }

    /**
     * Recovers urgent order list from Dades.java
     * @return urgent order list
     */
    public String recuperaComandaUrgents(){
        StringBuilder s = new StringBuilder();
        ArrayList<Comanda> c = dades.recuperaComandes();
        for(Comanda comanda : c)
            s.append(comanda.toString()).append("\n");
        return s.toString();
    }

    /**
     * Saves date to text file
     * @param camiDesti
     * @throws MercatException
     */
    public void guardaDades(String camiDesti) throws MercatException{

    }

    /**
     * Recovers data form text file
     * @param camiOrigen
     * @throws MercatException
     */
    public void carregaDades(String camiOrigen) throws MercatException{

    }
}
