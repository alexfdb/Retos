package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de 10 números enteros 
 * y lo ordene en orden ascendente (de menor a mayor).
 */
public class Reto18 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 9, 5, 4, 8, 6, 7, 9, 1};

        int intercambio = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < intercambio) {
                numeros[i] = intercambio;
            }
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] < intercambio) {
                    numeros[j] = intercambio;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
