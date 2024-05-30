package procesadores;

public class procesapc extends PROCESADORES{
    String scoket;

    public procesapc() {
    }

    public procesapc(String scoket) {
        this.scoket = scoket;
    }

    public String getScoket() {
        return scoket;
    }

    public void setScoket(String scoket) {
        this.scoket = scoket;
    }

    public void imprimir_datos () {
        System.out.println(scoket);
    }
}
