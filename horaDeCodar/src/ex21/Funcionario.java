package ex21;

public class Funcionario {
    private int id;
    private int anoNascimento;
    private int anoEmpregado;

    Funcionario(int id, int anoNascimento, int anoEmpregado) {
        this.id = id;
        this.anoNascimento = anoNascimento;
        this.anoEmpregado = anoEmpregado;
    }

    public void consultarAposentadoria() {
        if ((2024 - anoNascimento  >= 65)
                || (2024 - anoEmpregado >= 30)
                || (2024 - anoNascimento  >= 60 && 2024 - anoEmpregado >= 25)){
            System.out.println("Requerer aposentadoria");
            return;
        }
        System.out.println("Não requerer");
    }
}
