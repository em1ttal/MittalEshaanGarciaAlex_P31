package prog2.model;

public class ClientEstandard extends Client {
    /**
     * Constructor
     * @param name
     * @param emailAddress
     * @param homeAddress
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
