package prog2.model;

/**
 * Class that stores the relevant information of the articles
 * @author eshaan
 * @author alex
 */
public class Article {
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
     * When is the article shipped
     */
    private String shippingDate;
    /**
     * Shipping time
     */
    private int shippingTime;

    /**
     * Constructor
     * @param identifier
     * @param name
     * @param price
     * @param priorityShipping
     * @param shippingDate
     * @param shippingTime
     */
    public Article(String identifier, String name, float price, boolean priorityShipping, String shippingDate, int shippingTime) {
        this.identifier = identifier;
        this.name = name;
        this.price = price;
        this.priorityShipping = priorityShipping;
        this.shippingDate = shippingDate;
        this.shippingTime = shippingTime;
    }

    /**
     * Puts article information into one string
     * @return article information
     */
    @Override
    public String toString() {
        return "Id = " + identifier + ", Nom = " + name
                + ", Preu = " + price + ", Temps fins enviament"
                + shippingTime + ", Enviament Urgent = " + priorityShipping;
    }

    /**
     * Return article identifier
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets article identifier
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets article name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets article name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets article price
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets article price
     * @param price
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
     * @param priorityShipping
     */
    public void setPriorityShipping(boolean priorityShipping) {
        this.priorityShipping = priorityShipping;
    }

    /**
     * Gets article shipping date
     * @return date
     */
    public String getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets article shipping date
     * @param shippingDate
     */
    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    /**
     * Gets article shipping time
     * @return total time
     */
    public int getShippingTime() {
        return shippingTime;
    }

    /**
     * Sets article shipping time
     * @param shippingTime
     */
    public void setShippingTime(int shippingTime) {
        this.shippingTime = shippingTime;
    }
}
