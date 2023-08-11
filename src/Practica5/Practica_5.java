package Practica5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, m, temporal, aux;
        int total = 0;
        int[] vectorPrincipal = new int[100];

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            vectorPrincipal[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vectorPrincipal[j] > vectorPrincipal[i]){
                    temporal = vectorPrincipal[i];
                    vectorPrincipal[i] = vectorPrincipal[j];
                    vectorPrincipal[j] = temporal;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (vectorPrincipal[i] < 0) {
                aux = vectorPrincipal[i];
                total = total + aux;
            }
        }
        System.out.print(total * -1);
    }
}
