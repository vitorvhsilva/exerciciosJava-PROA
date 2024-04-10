package ex04.formas;

public class Quadrado {

    private double base;

    public Quadrado(double base) {
        this.base = base;
    }

    public void realizarCalculo(){
        double calculo = base * base;
        System.out.println("O valor da área é: " + calculo);
    }
}
