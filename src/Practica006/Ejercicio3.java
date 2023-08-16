/*Recuento de frecuencias:
* Cual es el elemento que mas veces aparece en
* el arreglo, es decir, cual es la moda? */
package Practica006;

import java.util.Scanner;

public class Ejercicio3 {

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

    public int findMode(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        int maxCount = 0;
        int mode = -1;

        int currentCount = 1;
        int currentNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentNum) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = currentNum;
                }
                currentNum = arr[i];
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            mode = currentNum;
        }

        return mode;
    }

    public void printArray(int[] arr) {
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ejercicio3 eje = new Ejercicio3();

        int arraySize;
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        eje.printArray(array);

        int moda = eje.findMode(array);
        System.out.println("\nFashion Array: " + moda);
    }
}
