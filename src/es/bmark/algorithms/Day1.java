package es.bmark.algorithms;

public class Day1 {

    /*ENUNCIADO: Dado un argumento int DEVOLVER: 1 si es primo o el menor divisor que no sea 1 del argumento si no es
    * primo
    * EJEMPLOS: 7-> 1, 23 -> 1, 50 -> 2*/

    //TIEMPO: 09:04

    public static void main(String[] args) {
        //System.out.println(algorithm(50));
        System.err.println(">>> Tests");
        System.out.println(algorithm(50));
        System.out.println(algorithm(23));
        System.out.println(algorithm(33));
    }

    public static int algorithm(int n) {
        int minimoDivisor = 0;
        boolean esPrimo = true;
        for (int i = (n - (n/2)); i > 1; i--) {
            if (n % i == 0) {
                minimoDivisor = i;
                esPrimo = false;
            }
        }
        if (minimoDivisor != 0 && esPrimo == false) {
            return minimoDivisor;
        } else {
            return 1;
        }
    }
}
