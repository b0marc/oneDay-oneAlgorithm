package es.bmark.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Day5 {
    //tiempo: 11 min

    public static void main(String[] args) {
        System.err.println(">>> Test");

        List<Integer> duplicados = new ArrayList<>();
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(6);
        duplicados.add(9);
        duplicados.add(9);
        deleteDuplications(duplicados).forEach(System.out::println);
    }


    /*Eliminar duplicaciones de un array ordenado*/
    public static List<Integer> deleteDuplications(List<Integer> list) {
        List<Integer> nonRepItems = new ArrayList<>();
        Integer item = null;

        for (Integer i : list) {
            if (item != null && item != i) {
                nonRepItems.add(i);
                item = i;
            }
            if (item == null) nonRepItems.add(i);
            item = i;
        }
        return nonRepItems;
    }
}
