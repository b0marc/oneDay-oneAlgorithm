package es.bmark.algorithms;

public class Day1 {
    //Tiempo: 09:04

    public static void main(String[] args) {
        //System.out.println(algorithm(50));
        System.err.println(">>> Tests");
        System.out.println(algorithm(50));
        System.out.println(algorithm(23));
        System.out.println(algorithm(33));
    }


    /**
     * Devolver 1 si el argumento es primo, si no, menor divisor posible diferente de 1
     *
     * @param n numero
     * @return 1 si primo, si no, menor divisor
     * */
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
