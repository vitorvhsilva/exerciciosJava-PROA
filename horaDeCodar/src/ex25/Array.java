package ex25;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    Object[] array;
    ArrayList<String> listaLetras;
    ArrayList<Integer> listaNumeros;

    public Array(Object[] array) {
        this.array = array;
        this.listaLetras = new ArrayList<>();
        this.listaNumeros = new ArrayList<>();
    }

    public void inverterLista() {
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public void inverterListaPorTipo() {
        for (Object itemLista : array) {
            if (itemLista.getClass().getSimpleName().equals("Integer")) {
                listaNumeros.add((Integer) itemLista);
            } else {
                listaLetras.add((String) itemLista);
            }
        }
        System.out.println(listaLetras + " - " + listaNumeros);
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
