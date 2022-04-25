package prog2.model;
import prog2.vista.MercatException;
import java.io.Serializable;

/**
 * Class of order list
 * @author eshaan
 * @author alex
 */
public class LlistaComandes extends Llista<Comanda> implements Serializable {
    /**
     * Abstract method that checks if object can be added to the list
     * @return boolean can be added?
     */
    @Override
    public boolean comprova(Comanda comanda) {
        if(comanda instanceof ComandaUrgent && comanda.tipusComanda().equalsIgnoreCase("Normal"))
            return false;
        return true;
    }

    /**
     * Abstract method to add object to list
     * @param comanda
     * @throws MercatException
     */
    @Override
    public void afegir(Comanda comanda) throws MercatException {
        if(!comprova(comanda)) throw new MercatException("No se puede añadir un envio normal a un envio urgente!");

        llista.add(comanda);
    }

    @Override
    public void esborrar(Comanda c) throws MercatException{
        if(c.comandaEnviada()) throw new MercatException("El pedido ya ha sido enviado");

        llista.remove(c);
    }
}
