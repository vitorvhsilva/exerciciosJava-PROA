package ex24;

public class Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;
    private double salarioHorasTrabalhadas;
    private double salarioHorasExtras;
    private double salarioTotal;

    public Funcionario(int horasTrabalhadas, double valorPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public void calcularSalario() {
        if (horasTrabalhadas > 160) {
            salarioHorasTrabalhadas = valorPorHora * horasTrabalhadas;
            salarioHorasExtras = (valorPorHora * (horasTrabalhadas - 160)) * 1.50;

            salarioTotal = salarioHorasTrabalhadas + salarioHorasExtras;
            System.out.println("O salário do funcionário com hora extra foi: " + salarioTotal);
            return;
        }
        salarioTotal = valorPorHora * horasTrabalhadas;
        System.out.println("O salário do funcionário foi: " + salarioTotal);

    }
}
