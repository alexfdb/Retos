package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de números 
 * enteros y cuente cuántos de ellos son negativos.
 */
public class Reto26 {
    public static void main(String[] args) {
        int[] numeros = {-22, 55, -74, 33, -12};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " números negativos.");
    }
}
