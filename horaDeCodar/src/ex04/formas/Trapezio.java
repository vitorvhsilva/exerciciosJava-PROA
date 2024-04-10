package ex04.formas;

public class Trapezio {

    private double basemaior;
    private double basemenor;
    private double altura;


    public Trapezio(double basemaior, double basemenor, double altura) {
        this.basemaior = basemaior;
        this.basemenor = basemenor;
        this.altura = altura;
    }

    public void realizarCalculo(){
        double calculo = ((basemaior + basemenor) * altura) / 2;
        System.out.println("O valor da área é: " + calculo);
    }
}
