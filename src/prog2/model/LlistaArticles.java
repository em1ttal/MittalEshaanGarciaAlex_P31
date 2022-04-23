package prog2.model;
import prog2.vista.MercatException;
import java.io.Serializable;

/**
 * Class of article list
 * @author eshaan
 * @author alex
 */
public class LlistaArticles extends Llista<Article> implements Serializable {
    /**
     * Abstract method that checks if object can be added to the list
     * @return boolean can be added?
     */
    @Override
    public boolean comprova(Article article) {
        for(Article a : llista){
            if(a.getIdentifier().equalsIgnoreCase(article.getIdentifier()))
                return false;
        }
        return true;
    }

    /**
     * Abstract method to add object to list
     * @param article
     * @throws MercatException
     */
    @Override
    public void afegir(Article article) throws MercatException {
        if(!comprova(article)) throw new MercatException("Ya existe una article con esta identificador!");

        llista.add(article);
        System.out.println("Article added");
    }
}
