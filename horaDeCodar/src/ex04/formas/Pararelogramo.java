package ex04.formas;

public class Pararelogramo {

    private double base;
    private double altura;

    public Pararelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void realizarCalculo(){
        double calculo = base * altura;
        System.out.println("O valor da área é: " + calculo);
    }
}
