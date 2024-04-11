package ex25;

public class Main {

    public static void main(String[] args) {
        Object[] array = new Object[]{"A", 1, "B", 2, "C", 3, "D", 4, "E", 5, "F", 6};

        Array lista = new Array(array);
        lista.inverterLista();
        System.out.println(lista.toString());
        lista.inverterListaPorTipo();



    }

}
