package prog2.model;

import prog2.vista.MercatException;

import java.io.Serializable;

/**
 * Class of client list
 * @author eshaan
 * @author alex
 */
public class LlistaClients extends Llista<Client> implements Serializable {
    /**
     * Abstract method that checks if object can be added to the list
     * @return boolean can be added?
     */
    @Override
    public boolean comprova(Client client) {
        for(Client c : llista){
            if(c.getEmailAddress().equalsIgnoreCase(client.getEmailAddress()))
                return false;
        }
        return true;
    }

    /**
     * Abstract method to add object to list
     * @param client
     * @throws MercatException
     */
    @Override
    public void afegir(Client client) throws MercatException {
        if(!comprova(client)) throw new MercatException("Ya existe un client con este correo electronico!");

        llista.add(client);
    }
}
