package prog2.model;

/**
 * Abstract class of clients
 * @author eshaan
 * @author alex
 */
public abstract class Client {
    /**
     * Client's name
     */
    private String name;
    /**
     * Client's email address
     */
    private String emailAddress;
    /**
     * Client's home address
     */
    private String homeAddress;

    /**
     * Constructor
     * @param name
     * @param emailAddress
     * @param homeAddress
     */
    Client(String name, String emailAddress, String homeAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
    }

    /**
     * Searches type of client
     * @return type
     */
    public abstract String tipusClient();

    /**
     * Calculates monthly bill
     * @return bill
     */
    public abstract float calcMensual();

    /**
     * Calculates discount in percent
     * @return discount
     */
    public abstract float descompteEnv();

    public String toString(){
        return "Tipus = " + tipusClient() + ", Email = " +
                emailAddress + ", Nom = " + name + ", Adreça = " +
                homeAddress + ", Descompte Enviament = " + descompteEnv() +
                ", Mensualitat = " + calcMensual();
    }

    /**
     * Gets client's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets client's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets client's email address
     * @return email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets client's email address
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets client's home address
     * @return home address
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets client's home address
     * @param homeAddress
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
