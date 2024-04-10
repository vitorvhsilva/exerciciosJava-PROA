package ex04.formas;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void realizarCalculo(){
        double calculo = (raio * raio) * 3.14;
        System.out.println("O valor da área é: " + calculo);
    }
}
