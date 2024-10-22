package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de números 
 * enteros y cuente cuántos de ellos son mayores que 50.
 */
public class Reto22 {
    public static void main(String[] args) {
        int[] numeros1 = {55, 22, 66, 33, 88};
        int contador = 0;

        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] > 50) {
                contador ++;
            }
        }

        System.out.println("Hay " + contador + " números mayores a cincuenta.");
    }
}
