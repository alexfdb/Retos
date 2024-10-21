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
            System.out.println(numeros[i]);
        }
    }
}
