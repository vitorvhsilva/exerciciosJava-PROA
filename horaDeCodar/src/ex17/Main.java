package ex17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica: ");
        int custoDeFabrica = leitor.nextInt();leitor.nextLine();

        int distribuidor = (int) (custoDeFabrica * 0.28);
        int imposto = (int) (custoDeFabrica * 0.45);



        System.out.println("Quantidade de votos brancos: " + (custoDeFabrica + distribuidor + imposto));
    }
}
