package es.bmark.algorithms;

import java.util.*;

public class Day2_2 {
    //Tiempo: 7 min

    public static void main(String[] args) {
        System.err.println(">>> Test");

        Map<Character, Integer> mapa = algorithm("abracadabra");

        for (Map.Entry<Character, Integer> entry: mapa.entrySet()) {
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
    }


    //numero de veces que se repite cada caracter del string.
    public static Map<Character, Integer> algorithm(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int k = map.get(c);
                k++;
                map.put(c, k);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
