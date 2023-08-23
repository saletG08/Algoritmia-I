package Examenes.Examen1;
//c) Proponer un algoritmo con complejidad O(n)
public class Ejercicio3 {
    public static int maxDifferenceON(int[] array) {
        int maxDiff = 0;
        int min = array[0];

        for (int num : array) {
            maxDiff = Math.max(maxDiff, num - min);
            min = Math.min(min, num);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] array = new int[n];

        array[0] = 7;
        array[1] = 15;
        array[2] = 16;

        int result = maxDifferenceON(array);
        System.out.println("Max Difference: " + result);
    }
}
