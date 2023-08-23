package Examenes.Examen1;
//a) Proponer un algoritmo con complejidad O(n^2)
public class Ejercicio1 {
    public static int maxDifferenceON2(int[] array) {
        int maxDiff = Integer.MIN_VALUE;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int diff = 0;
            for (int j = i + 1; j < n; j++) {
                diff = Math.max(diff, Math.abs(array[i] - array[j]));
            }
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] array = new int[n];

        array[0] = 7;
        array[1] = 15;
        array[2] = 16;
        int result = maxDifferenceON2(array);
        System.out.println("Max Difference: " + result);
    }
}
