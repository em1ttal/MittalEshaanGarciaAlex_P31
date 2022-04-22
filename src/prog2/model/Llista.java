package prog2.model;

import java.io.Serializable;
import java.util.ArrayList;

import prog2.vista.MercatException;

/**
 * General class of lists
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
     * @return size
     */
    public int getSize() {
        return llista.size();
    }

    /**
     * Abstract method that checks if object can be added to the list
     * @return boolean can be added?
     */
    public abstract boolean comprova(T t);

    /**
     * Abstract method to add object to list
     * @param t
     * @throws MercatException
     */
    public abstract void afegir(T t) throws MercatException;

    /**
     * Deletes object from list
     * @param t object
     */
    public void esborrar(T t) {
        llista.remove(t);
    }

    /**
     * Gets object from given position
     * @param position
     * @return
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
     * @return ArrayList
     */
    public ArrayList<T> getArrayList() {
        ArrayList<T> arrlist = new ArrayList<>(llista);
        return arrlist;
    }
}
