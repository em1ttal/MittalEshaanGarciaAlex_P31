package prog2.adaptador;

import prog2.model.*;
import prog2.vista.MercatException;

import java.io.*;
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
     * @param id          the id
     * @param nom         the nom
     * @param preu        the preu
     * @param temps       the temps
     * @param admetUrgent the admet urgent
     * @throws MercatException the mercat exception
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
     * @param email     the email
     * @param nom       the nom
     * @param adreca    the adreca
     * @param esPremium the es premium
     * @throws MercatException the mercat exception
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
     * @param articlePos the article pos
     * @param clientPos  the client pos
     * @param quantitat  the quantitat
     * @param esUrgent   the es urgent
     * @throws MercatException the mercat exception
     */
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException{
        dades.afegirComanda(articlePos, clientPos, quantitat, esUrgent);
    }

    /**
     * Passes position of order to remove
     * @param pos the pos
     * @throws MercatException the mercat exception
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
        ArrayList<Comanda> c = dades.recuperaComandesUrgents();
        for(Comanda comanda : c)
            s.append(comanda.toString()).append("\n");
        return s.toString();
    }

    /**
     * Saves data to text file
     * @param camiDesti the cami desti
     * @throws MercatException the mercat exception
     */
    public void guardaDades(String camiDesti) throws MercatException{
        File file = new File(camiDesti);
        FileOutputStream fos;
        try{
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dades);
            fos.close();
            System.out.println("Dades guardado");
        } catch (FileNotFoundException e) {
            System.out.println("EXCEPTION: File not found!");
        } catch (IOException e) {
            System.out.println("EXCEPTION: IO Exception!");
        }
    }

    /**
     * Recovers data form text file
     * @param camiOrigen the cami origen
     * @throws MercatException the mercat exception
     */
    public void carregaDades(String camiOrigen) throws MercatException{
        File file = new File(camiOrigen);
        try{
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);
            dades = (Dades) ois.readObject();
            ois.close();
            fin.close();
            System.out.println("Dades cargado");
        } catch (FileNotFoundException e) {
            System.out.println("EXCPETION: File not found!");
        } catch (IOException e) {
            System.out.println("EXCEPTION: IO Exception!");
        } catch (ClassNotFoundException e) {
            System.out.println("EXCEPTION: Class not found!");
        }
    }
}
