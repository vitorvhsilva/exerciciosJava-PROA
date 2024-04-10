package ex20;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private double valorVenda;
    private double desconto;
    private double valorTotal;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void exibirRecibo() {
        valorVenda = quantidade * preco;
        if (quantidade <= 5) {
            desconto = 0.98;
        }
        if (quantidade > 5 && quantidade <= 10) {
            desconto = 0.97;
        }
        if (quantidade > 10) {
            desconto = 0.95;
        }
        valorTotal = (valorVenda * 1.20);
        valorTotal *= desconto;
        System.out.println("Recibo: " +
                "\nNome Produto: " + nome +
                "\nQuantidade Produto: " + quantidade +
                "\nPreço Produto: " + preco +
                "\nValor Total: " + valorTotal);
    }
}
