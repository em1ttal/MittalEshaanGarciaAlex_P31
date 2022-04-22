package prog2.model;

import prog2.vista.MercatException;

import java.io.Serializable;

public class LlistaArticles extends Llista<Article> implements Serializable {
    /**
     * Abstract method that checks if object can be added to the list
     * @return boolean can be added?
     */
    @Override
    public boolean comprova() {

    }

    /**
     * Abstract method to add object to list
     * @param article
     * @throws MercatException
     */
    @Override
    public void afegir(Article article) throws MercatException {

    }
}
