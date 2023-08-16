/*Eliminación de repetidos:
* Como podemos eliminar todas las copias excepto
* una de los elementos repetidos del arreglo?*/
package Practica006;

import java.util.Scanner;

public class Ejercicio2 {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public int removeDuplicates(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        int newSize = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }

    public void printArray(int[] arr) {
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printArrayWithoutRepeats(int newSize, int[] arr){
        System.out.println("\nArray With Equal Numbers Removed: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ejercicio2 ejercicio2 = new Ejercicio2();


        int arraySize;
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        ejercicio2.printArray(array);

        int newSize = ejercicio2.removeDuplicates(array);

        ejercicio2.printArrayWithoutRepeats(newSize, array);
    }
}
