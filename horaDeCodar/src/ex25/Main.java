package ex25;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[]{"A", 1, "B", 2, "C", 3, "D", 4, "E", 5, "F", 6};
        int parar = args.length / 2;
        for (int i = 0, j = array.length - 1; j >= parar; j--, i++) {
            Object auxiliar = array[i];
            array[i] = array[j];
            array[j] = auxiliar;


        }
    }
}
