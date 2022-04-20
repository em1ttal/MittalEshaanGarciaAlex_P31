package prog2.model;

/**
 * Class for standard client type
 */
public class ClientEstandard extends Client {
    /**
     * Constructor
     * @param name         the name
     * @param emailAddress the email address
     * @param homeAddress  the home address
     */
    public ClientEstandard(String name, String emailAddress, String homeAddress) {
        super(name, emailAddress, homeAddress);
    }

    @Override
    public String tipusClient() {
        return "Estandard";
    }

    @Override
    public float calcMensual() {
        return 0;
    }

    @Override
    public float descompteEnv() {
        return 0;
    }
}
