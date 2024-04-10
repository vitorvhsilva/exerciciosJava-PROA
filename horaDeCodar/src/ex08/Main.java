package ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = leitor.nextDouble();leitor.nextLine();

        System.out.println("Digite o segundo valor: ");
        double num2 = leitor.nextDouble();leitor.nextLine();

        while (num2 <= 0 || num2 > num1) {
            System.out.println("Inválido! Digite novamente: ");
            num2 = leitor.nextDouble();leitor.nextLine();
        }

        System.out.println("Divisão de " + num1 + " por " + num2 + ": " + (num1 / num2));
    }
}
