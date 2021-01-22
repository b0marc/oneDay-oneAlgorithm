package es.bmark.algorithms;

import java.util.List;

public class Day4 {
    //tiempo: 9 min

    public static void main(String[] args) {
        System.err.println(">>> Test");
        List<Integer> lista1 = List.of(4, 7, 3);
        List<Integer> lista2 = List.of(8, 2, 5);
        List<Integer> lista3 = List.of(50, 23, 45);
        List<List<Integer>> array = List.of(lista1, lista2, lista3);

        System.out.println(diagonalDifference(array));

    }

    /*
    * Dada una matriz cuadrada, calcule la diferencia absoluta entre las sumas de sus diagonales.
    * Ejercicio de la plataforma hackerrnak
    * en este caso se ha usado list<list> aunque es perfectamente valido un array bidimensional
    * */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeftRigthDiagonal = 0;
        int sumRightLeftDiagonal = 0;

        for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
            sumLeftRigthDiagonal += arr.get(i).get(i);
            sumRightLeftDiagonal += arr.get(j).get(i);
        }

        return Math.abs(sumLeftRigthDiagonal - sumRightLeftDiagonal);

    }

}
