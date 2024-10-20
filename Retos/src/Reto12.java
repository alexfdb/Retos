package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que reciba un array de números enteros y 
 * determine cuál es el número mayor y cuál es el menor.
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto12 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto12.class.getName());
    
    public static void main(String[] args) {
        logger.info("¿Cuantos numeros desea ingresar?");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];

        for (int i = 0; i < numeros.length; i++) {
            logger.info("Ingrese el número " + (i + 1) + ':');
            numeros[i] = sc.nextInt();
            }

            int mayor = numeros[0];
            int menor = numeros[0];
            int posicionMayor = 1;
            int posicionMenor = 1;

        for (int i = 1; i < numeros.length; i++) {

            if(numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i + 1;
            }

            if (numeros[i] < menor){
                menor = numeros[i];
                posicionMenor = i + 1;
            }
        }
        
        logger.info("El mayor número es el " + mayor + " ingresado en la posición " + posicionMayor + '.');
        logger.info("El menor número es el " + menor + " ingresado en la posición " + posicionMenor + '.');

        sc.close();
    }
}
