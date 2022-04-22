package prog2.model;
import prog2.vista.MercatException;
import java.util.List;

/**
 * Class that communicates with Adaptador.java
 * @author eshaan
 * @author alex
 */
public class Dades implements InDades {
    Dades(){

    }

    @Override
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {

    }

    @Override
    public List<String> recuperaArticles() {
        return null;
    }

    @Override
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {

    }

    @Override
    public List<String> recuperaClients() {
        return null;
    }

    @Override
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {

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
