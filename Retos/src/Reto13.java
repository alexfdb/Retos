package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de números enteros y lo "rote" una 
 * posición hacia la derecha. El último elemento debe convertirse en el primero.
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto13 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto13.class.getName());

    public static void main(String[] args) {
        logger.info("¿Cuantos números desea ingresar?");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];

        for (int i = 0; i < numeros.length; i++) {
            logger.info("Ingrese el número de la posición: " + (i + 1) + '.');
            numeros[i] = sc.nextInt();
        }

        int ultimoValor = numeros[numeros.length - 1];

        for (int i = numeros.length -1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimoValor;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }    
}
