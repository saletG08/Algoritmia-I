package Practica007;
public class SumPairFinder {
    public void findSumPair(int[] arr, int targetSum) {
        boolean foundPair = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Se encontró un par que suma " + targetSum + ": " + arr[i] + " + " + arr[j]);
                    foundPair = true;
                }
            }
        }

        if (!foundPair) {
            System.out.println("No se encontró ningún par que sume " + targetSum);
        }
    }

    public static void main(String[] args) {
        SumPairFinder sum = new SumPairFinder();

        int[] arr = {2, 4, 6, 7, 9};
        int targetSum = 13;

        sum.findSumPair(arr, targetSum);
    }
}
