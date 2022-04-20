package prog2.model;

public class ClientPremium extends Client {
    /**
     * Constructor
     * @param name
     * @param emailAddress
     * @param homeAddress
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
