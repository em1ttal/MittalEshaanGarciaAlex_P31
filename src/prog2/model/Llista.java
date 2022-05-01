package prog2.model;

import prog2.vista.MercatException;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * General class of lists
 * @param <T> the type parameter
 * @author eshaan
 * @author alex
 */
public abstract class Llista<T> implements Serializable {
    /**
     * General ArrayList
     */
    protected ArrayList<T> llista;

    /**
     * Constructor
     */
    public Llista() {
        llista = new ArrayList<>();
    }

    /**
     * Gets size of current ArrayList
     * @return size size
     */
    public int getSize() {
        return llista.size();
    }

    /**
     * Abstract method that checks if object can be added to the list
     * @param t the t
     * @return boolean can be added?
     */
    public abstract boolean comprova(T t);

    /**
     * Abstract method to add object to list
     * @param t the t
     * @throws MercatException the mercat exception
     */
    public abstract void afegir(T t) throws MercatException;

    /**
     * Deletes object from list
     * @param t object
     * @throws MercatException the mercat exception
     */
    public void esborrar(T t) throws MercatException{
        llista.remove(t);
    }

    /**
     * Gets object from given position
     * @param position the position
     * @return at
     */
    public T getAt(int position) {
        return llista.get(position);
    }

    /**
     * Clears ArrayList
     */
    public void clear() {
        llista.clear();
    }

    /**
     * Check if ArrayList is empty
     * @return boolean empty?
     */
    public boolean isEmpty() {
        return llista.isEmpty();
    }

    /**
     * Gets the ArrayList
     * @return ArrayList array list
     */
    public ArrayList<T> getArrayList() {
        ArrayList<T> arrlist = new ArrayList<>(llista);
        return arrlist;
    }
}
