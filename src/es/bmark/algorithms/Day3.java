package es.bmark.algorithms;

public class Day3 {
    //tiempo: >20 min

    public static void main(String[] args) {
        System.err.println(">>> Test");
        System.out.println(rotateString("musica", "sicamu")); //true
        System.out.println(rotateString("lopez", "zelop")); //false
        System.out.println(rotateString("mastodonte", "dontemasto")); //false
    }

    /*COmprobar si una cadena es rotacion de otra. Este metodo no comprueba la longitud de la cadena, esto se
    * realizaria en otro método
    * Ejemplos de rotacion: lopez -> pezlo, cambio -> mbioca */
    public static boolean rotateString(String original, String s) {
        //concatenamos para evitar problemas con estados en loop
        String sConcat = s.concat(s);
        //estados que coinciden con original
        int estadosCOmpletados = 0;
        int ultimoEstado = 0;

        //lopez //ezlop
        for (int i = 0; i < original.length(); i++) {

            for (; ultimoEstado < sConcat.length() - 1; ultimoEstado++) {
                if (original.charAt(i) == sConcat.charAt(ultimoEstado)) {
                    estadosCOmpletados++;
                    ultimoEstado++;
                    break;
                }
                if ((estadosCOmpletados != 0) && (original.charAt(i) != sConcat.charAt(ultimoEstado))) {
                    estadosCOmpletados = 0;
                }
            }
        }
        if (estadosCOmpletados == original.length()) {
            return true;
        } else {
            return false;
        }
    }

}
