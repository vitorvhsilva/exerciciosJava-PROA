package ex04.formas;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void realizarCalculo(){
        double calculo = base * altura;
        System.out.println("O valor da área é: " + calculo);
    }
}
