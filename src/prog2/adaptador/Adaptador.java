package prog2.adaptador;

import prog2.model.Dades;
import prog2.vista.MercatException;

import java.util.ArrayList;
import java.util.List;

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
    Adaptador(){
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
     * @return Article list
     */
    public List<String> recuperaArticles(){
        return dades.recuperaArticles();
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
     * @return client list
     */
    public List<String> recuperaClients(){
        return dades.recuperaClients();
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
     * @return all order list
     */
    public List<String> recuperaComanda(){
        return dades.recuperaComandes();
    }

    /**
     * Recovers urgent order list from Dades.java
     * @return urgent order list
     */
    public List<String> recuperaComandaUrgents(){
        return dades.recuperaComandesUrgents();
    }
}
