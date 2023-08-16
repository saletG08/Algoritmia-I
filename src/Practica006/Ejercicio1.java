/*Comprobación de unicidad:
 * Cómo podemos comprobar si los elementos de un arreglo son todos distintos?*/

package Practica006;

import java.util.Scanner;

public class Ejercicio1 {

    public void printEquality (int[] array) {
        if (areAllElementsDistinct(array)) {
            System.out.println("All the elements are different.");
        } else {
            System.out.println("There are repeated elements.");
        }
    }

    public boolean areAllElementsDistinct (int[] array){
        quickSort(array, 0, array.length - 1);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public void quickSort (int[] array, int low, int high){
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public int partition (int[] array, int low,int high){
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ejercicio1 eje = new Ejercicio1();

        int arraySize;
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        eje.printEquality(array);
    }
}
