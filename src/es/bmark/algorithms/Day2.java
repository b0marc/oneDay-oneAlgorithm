package es.bmark.algorithms;

public class Day2 {
    //Tiempo: 5 min

    public static void main(String[] args) {
        System.err.println(">>> Tests");
        int[] numeros = new int[]{2, 5, 6, 2, 5, 7, 10};
        System.out.println(mayorSuma1(numeros));
    }


    /**
     * mayor suma posible tomando 2 numeros de nums[].
     *
     * @param nums de int
     * @return mayor numero posible tomando 2 numeros nums
     * */
    public static int mayorSuma1(int[] nums) {
        int sumaMayor = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                int sum;
                if ((sum = nums[i] + nums[j]) > sumaMayor) sumaMayor = sum;
            }
        }
        return sumaMayor;
    }
}
