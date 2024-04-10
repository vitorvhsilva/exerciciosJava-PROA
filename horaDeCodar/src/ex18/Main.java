package ex18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Gabriel Augusto", 5000,
                0, 50 , new ArrayList<Venda>());

        funcionario1.fazerVenda(new Venda("BMW", 154320));
        funcionario1.fazerVenda(new Venda("Porsche", 634000));
        funcionario1.fazerVenda(new Venda("Mercedes Benz", 350670));
        funcionario1.exibirFuncionario();
        
    }
}
