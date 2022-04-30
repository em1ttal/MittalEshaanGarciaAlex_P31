/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.util.ArrayList;
import java.util.List;
import prog2.vista.MercatException;

/**
 * The interface In dades.
 *
 * @author dortiz
 */
public interface InDades {

    /**
     * Afegir article.
     *
     * @param id          the id
     * @param nom         the nom
     * @param preu        the preu
     * @param temps       the temps
     * @param admetUrgent the admet urgent
     * @throws MercatException the mercat exception
     */
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException;

    /**
     * Recupera articles array list.
     *
     * @return the array list
     */
    public ArrayList<Article> recuperaArticles();

    /**
     * Afegir client.
     *
     * @param email     the email
     * @param nom       the nom
     * @param adreca    the adreca
     * @param esPremium the es premium
     * @throws MercatException the mercat exception
     */
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException;

    /**
     * Recupera clients array list.
     *
     * @return the array list
     */
    public ArrayList<Client> recuperaClients();

    /**
     * Afegir comanda.
     *
     * @param articlePos the article pos
     * @param clientPos  the client pos
     * @param quantitat  the quantitat
     * @param esUrgent   the es urgent
     * @throws MercatException the mercat exception
     */
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException;

    /**
     * Esborrar comanda.
     *
     * @param position the position
     * @throws MercatException the mercat exception
     */
    public void esborrarComanda(int position) throws MercatException;

    /**
     * Recupera comandes array list.
     *
     * @return the array list
     */
    public ArrayList<Comanda> recuperaComandes();

    /**
     * Recupera comandes urgents array list.
     *
     * @return the array list
     */
    public ArrayList<Comanda> recuperaComandesUrgents();
}
