package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double valorTotal = 0;
        int media = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor");
            double num = leitor.nextDouble();leitor.nextLine();
            valorTotal += num;
            media++;
        }

        System.out.println(valorTotal / media);
    }
}
