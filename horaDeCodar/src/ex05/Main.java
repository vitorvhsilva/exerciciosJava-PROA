package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int num = leitor.nextInt();leitor.nextLine();

        if (num < 0 ){
            System.out.println("Valor negativo");
        } else if (num == 0) {
            System.out.println("Valor neutro");
        } else if (num > 1) {
            System.out.println("Valor positivo");
        }
    }
}