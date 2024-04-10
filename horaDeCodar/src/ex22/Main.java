package ex22;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int num = 1;

        for (i = 1; i <= 20; i++) {
            System.out.print(i + ", ");
            for (j = 1; j <= 10; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("\n");
        }
    }
}
