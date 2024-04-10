package ex04;

import ex04.formas.Circulo;
import ex04.formas.Losango;
import ex04.formas.Pararelogramo;

public class Main {
    public static void main(String[] args) {

        new Circulo(3).realizarCalculo();
        new Losango(20, 10).realizarCalculo();
        new Pararelogramo(2, 4).realizarCalculo();

    }
}