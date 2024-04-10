package ex04.formas;

public class Losango {

    private double diagmaior;
    private double diagmenor;

    public Losango(double diagmaior, double diagmenor) {
        this.diagmaior = diagmaior;
        this.diagmenor = diagmenor;
    }

    public void realizarCalculo(){
        double calculo = (diagmaior * diagmenor) / 2;
        System.out.println("O valor da área é: " + calculo);
    }
}
