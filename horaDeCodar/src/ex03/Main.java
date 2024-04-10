package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();leitor.nextLine();


        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos");

    }
}