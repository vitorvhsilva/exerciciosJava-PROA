package ex15;

public class Main {
    public static void main(String[] args) {
        int anos = 0;
        double altAnacleto = 1.50;
        double altFelisberto = 1.10;

        for (int i = 0; altAnacleto > altFelisberto; i++) {
            anos++;
            altAnacleto += 0.02;
            altFelisberto += 0.03;
        }

        System.out.println("Foram necessários " + anos + " anos para o Feliberto passar o Anacleto");
    }
}
