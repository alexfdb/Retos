package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que tome un array de 10 números y calcule su promedio.
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto11 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto11.class.getName());

    public static void main(String[] args) {
        logger.info("¿Cuántos números desea ingresar?");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];

        int suma = 0;
        float promedio;

        for (int i = 0; i < numeros.length; i++) {
            logger.info("Ingrese el número " + (i +1) + ':');
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        promedio = suma / tamanio;

        logger.info("El promedio de los números ingresados es " + promedio + " dado que su suma es " + suma + '.');
    }
    
}
