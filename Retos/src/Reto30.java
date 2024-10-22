package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que divida un array de 10 elementos 
 * en dos arrays de 5 elementos cada uno.
 */
public class Reto30 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] numeros1 = new int[numeros.length / 2];
        int[] numeros2 = new int[numeros.length / 2];

        for (int i = 0; i < numeros.length; i++) {
            if (i < (numeros.length / 2)) {
                numeros1[i] = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i >= (numeros.length / 2)) {
                numeros2[i - numeros.length /2] = numeros[i];
            }
        }

        System.out.println("Array 1:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros1[i] + " ");
        }

        System.out.println();

        System.out.println("Array 2:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }
    }
}
