package Examenes.Examen1;

import java.util.Arrays;

//b) Proponer un algoritmo con complejidad O(nlogn)
public class Ejercicio2 {

    public static int maxDifferenceONLogN(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }

    public static void main(String[] args) {

        int n = 3;
        int[] array = new int[n];

        array[0] = 7;
        array[1] = 15;
        array[2] = 16;

        int result = maxDifferenceONLogN(array);
        System.out.println("Max Difference: " + result);
    }
}
