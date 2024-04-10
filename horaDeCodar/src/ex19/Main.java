package ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = leitor.nextDouble();leitor.nextLine();

        System.out.println("Digite o segundo numero: ");
        double num2 = leitor.nextDouble();leitor.nextLine();

        System.out.println("Digite o terceiro numero: ");
        double num3 = leitor.nextDouble();leitor.nextLine();

        if (num1 < (num2 + num3) && num2 < (num1 + num3) && num3 < (num2 + num1)){
            System.out.println("Foi possível formar um triângulo! ");
            return;
        }
        System.out.println("Não foi possível formar um triângulo! ");
    }
}
