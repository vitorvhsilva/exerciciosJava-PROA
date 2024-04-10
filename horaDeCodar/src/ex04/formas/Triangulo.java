package ex04.formas;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void realizarCalculo(){
        double calculo = (base * altura) / 2;
        System.out.println("O valor da área é: " + calculo);
    }
}
