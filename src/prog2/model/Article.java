package prog2.model;
import java.io.Serializable;

/**
 * Class with information of articles
 * @author eshaan
 * @author alex
 */
public class Article implements Serializable {
    /**
     * Article identifier
     */
    private String identifier;
    /**
     * Article name
     */
    private String name;
    /**
     * Article price
     */
    private float price;
    /**
     * Does article have priority shipping
     */
    private boolean priorityShipping;
    /**
     * Time from order to ship in minutes
     */
    private int timeToShip;

    /**
     * Constructor
     * @param identifier       the identifier
     * @param name             the name
     * @param price            the price
     * @param priorityShipping the priority shipping
     * @param timeToShip       the time from order to shipping (minutes)
     */
    public Article(String identifier, String name, float price, boolean priorityShipping, int timeToShip) {
        this.identifier = identifier;
        this.name = name;
        this.price = price;
        this.priorityShipping = priorityShipping;
        this.timeToShip = timeToShip;
    }

    /**
     * Puts article information into a string
     * @return article information
     */
    @Override
    public String toString() {
        return "Id: " + identifier + ", Nom: " + name
                + ", Preu: " + price + "€, Temps fins enviament: "
                + timeToShip + ", Enviament Urgent: " + priorityShipping;
    }

    /**
     * Return article identifier
     * @return identifier identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets article identifier
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets article name
     * @return name name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets article name
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets article price
     * @return price price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets article price
     * @param price the price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Gets if article has priority shipping
     * @return Priority shipping?
     */
    public boolean isPriorityShipping() {
        return priorityShipping;
    }

    /**
     * Sets if article has priority shipping
     * @param priorityShipping the priority shipping
     */
    public void setPriorityShipping(boolean priorityShipping) {
        this.priorityShipping = priorityShipping;
    }

    /**
     * Gets time to ship article
     * @return time time to ship
     */
    public int getTimeToShip() {
        return timeToShip;
    }

    /**
     * Sets time to ship article
     * @param timeToShip the time to ship
     */
    public void setTimeToShip(int timeToShip) {
        this.timeToShip = timeToShip;
    }
}
