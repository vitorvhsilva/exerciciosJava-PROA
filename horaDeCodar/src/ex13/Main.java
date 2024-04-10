package ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valorTotal = 0;
        int media = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = leitor.nextInt();leitor.nextLine();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = leitor.nextInt();leitor.nextLine();

        for (int i = num1; i < num2; i++) {
            valorTotal += i;
            media++;
        }

        System.out.println("Média: " + (valorTotal / media) );

    }
}
