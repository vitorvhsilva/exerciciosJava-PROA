package ex16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número total de habitantes do municipio: ");
        int habitantes = leitor.nextInt();leitor.nextLine();

        System.out.println("Digite a porcentagem de votos brancos: ");
        int votosBrancos = leitor.nextInt();leitor.nextLine();

        System.out.println("Digite a porcentagem de votos válidos: ");
        int votosValidos = leitor.nextInt();leitor.nextLine();

        System.out.println("Digite a porcentagem de votos nulos: ");
        int votosNulos = leitor.nextInt();leitor.nextLine();

        int porcentagemVotosBrancos = (int) (votosBrancos * 0.01);
        int porcentagemVotosValidos = (int) (votosValidos * 0.01);
        int porcentagemVotosNulos = (int) (votosNulos * 0.01);


        System.out.println("Quantidade de votos brancos: " + (habitantes * porcentagemVotosBrancos) +
                "\nQuantidade de votos válidos: " + (habitantes * porcentagemVotosValidos) +
                "\nQuantidade de votos nulos: " + (habitantes * porcentagemVotosNulos));
    }
}
