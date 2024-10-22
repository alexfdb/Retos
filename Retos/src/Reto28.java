package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de 5 números enteros y calcule la 
 * mediana (el número que queda en el centro al ordenar los elementos).
 */
public class Reto28 {
    public static void main(String[] args) {
        int[] numeros = {22, 66, 33, 88, 11};
        int mediana = numeros[0];

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp; 
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length / 2) {
                mediana = numeros[i];
            }
        }

        System.out.println("La mediana del array es " + mediana + ".");
    }
}
