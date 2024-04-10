package ex18;

public class Venda {
    private String nomeCarro;
    private int valorCarro;

    public Venda(String nomeCarro, int valorCarro) {
        this.nomeCarro = nomeCarro;
        this.valorCarro = valorCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public int getValorCarro() {
        return valorCarro;
    }
}
