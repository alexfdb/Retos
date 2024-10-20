package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba dos arrays de 5 números enteros cada 
 * uno y los sume, generando un nuevo array con los resultados.
 */
public class Reto17 {
    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numerosSumados = new int[numeros1.length];

        for (int i = 0; i < numeros1.length; i++) {
            numerosSumados[i] = numeros1[i] + numeros2[i];
        }

        for (int i = 0; i < numerosSumados.length; i++) {
            System.out.println("Suma de posición " + (i + 1) + ": " + numerosSumados[i]);
        }
    }
}