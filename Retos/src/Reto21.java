package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba dos arrays de 5 elementos 
 * cada uno y los combine en un solo array.
 */
public class Reto21 {
    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = {5, 6, 7, 8, 9};
        int[] numeros1y2 = new int[numeros1.length + numeros2.length];

        for (int i = 0; i < numeros1.length; i++) {
            numeros1y2[i] = numeros1[i];
        }

        for (int i = 0; i < numeros2.length; i++) {
            numeros1y2[i + numeros2.length] = numeros2[i]; 
        }

        for (int i = 0; i < numeros1y2.length; i++) {
            System.out.println(numeros1y2[i]);
        }
    }
}