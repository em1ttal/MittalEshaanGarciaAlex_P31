package prog2.model;

public class ComandaNormal extends Comanda {
    public ComandaNormal(Client client, Article article, int numArticles) {
        super(client, article, numArticles);
    }

    @Override
    public String tipusComanda() {
        return "Normal";
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
        return 1;
    }


}
