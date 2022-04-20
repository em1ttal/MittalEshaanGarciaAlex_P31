package prog2.model;

public class ComandaUrgent extends Comanda {
    public ComandaUrgent(Client client, Article article, int numArticles) {
        super(client, article, numArticles);
    }

    @Override
    public String tipusComanda() {
        return "Urgent";
    }

    @Override
    public boolean comandaEnviada() {
        return false;
    }

    @Override
    public boolean comandaRebuda() {
        return false;
    }

    @Override
    public float preuEnviament() {
        return 4;
    }
}
