package prog2.model;

/**
 * Class for premium client type
 */
public class ClientPremium extends Client {
    /**
     * Constructor
     * @param name         the name
     * @param emailAddress the email address
     * @param homeAddress  the home address
     */
    public ClientPremium(String name, String emailAddress, String homeAddress) {
        super(name, emailAddress, homeAddress);
    }

    @Override
    public String tipusClient() {
        return "Premium";
    }

    @Override
    public float calcMensual() {
        return 4;
    }

    @Override
    public float descompteEnv() {
        return 20;
    }


}
