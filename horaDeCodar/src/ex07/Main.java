package ex07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        double primeiroMaior = 0;
        double segundoMaior = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o número: ");
            numeros.add(leitor.nextDouble());
        }

        primeiroMaior = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            if (primeiroMaior < numeros.get(i)) {
                primeiroMaior = numeros.get(i);
            }
            numeros.remove(primeiroMaior);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (segundoMaior < numeros.get(i)) {
                segundoMaior = numeros.get(i);
            }
        }

        System.out.println("1 Maior: " + primeiroMaior + ", 2 Maior:" + segundoMaior);
    }
}
