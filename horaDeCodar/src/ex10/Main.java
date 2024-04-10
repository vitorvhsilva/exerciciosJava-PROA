package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double notaTotal = 0;
        int media = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota do aluno");
            double num = leitor.nextDouble();leitor.nextLine();
            notaTotal += num;
            media++;
        }

        if ( (notaTotal / media) > 6 ) {
            System.out.println("Aprovado! ");
        } else {
            System.out.println("Reprovado! ");
        }
    }
}
