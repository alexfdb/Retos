package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que reciba un array de 10 números enteros y cuente cuántos 
 * de ellos son pares y cuántos son impares.
 */
public class Reto16 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }

        System.out.println("Números pares: " + pares + ", Números impares : " + impares + '.');
        
    }
}
