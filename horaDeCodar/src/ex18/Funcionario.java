package ex18;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private double salarioFixo;
    private int numCarrosVendidos;
    private double comissaoFixa;
    private ArrayList<Venda> vendas;
    private double valorVendas;

    Funcionario (String nome, double salarioFixo, int numCarrosVendidos, int comissaoFixa, ArrayList<Venda> vendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.numCarrosVendidos = numCarrosVendidos;
        this.comissaoFixa = comissaoFixa;
        this.vendas = vendas;
    }

    public void fazerVenda(Venda vendaFeita) {
        if ( vendaFeita.getNomeCarro() != null && !vendaFeita.getNomeCarro().equals("")
                && vendaFeita.getValorCarro() > 0) {
            numCarrosVendidos++;
            vendas.add(vendaFeita);
            System.out.println("Venda feita!");
            valorVendas += (vendaFeita.getValorCarro() * 0.05);
            return;
        }
        System.out.println("Não foi possível fazer a venda");

    }

    public void exibirVendas() {
        if (!vendas.isEmpty()) {
            for (int i = 0; i < vendas.size(); i++) {
                System.out.println("\nValor da " + (i + 1) + " venda: " + vendas.get(i).getValorCarro() +
                        "\nNome do carro vendido: " + vendas.get(i).getNomeCarro());
            }
            return;
        }
        System.out.println("Não existem itens vendidos!");
    }

    public void exibirvalorVendas() {
        System.out.println("Salário do mês: " + (salarioFixo + (comissaoFixa * numCarrosVendidos)
                + valorVendas));
    }

    public void exibirFuncionario () {
        System.out.println("Funcionário " + nome +
                "\nSalário fixo: " + salarioFixo +
                "\nCarros vendidos: " + numCarrosVendidos +
                "\nComissão fixa: " + comissaoFixa);
        exibirVendas();
        exibirvalorVendas();
    }

}
