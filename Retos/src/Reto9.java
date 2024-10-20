package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un número y determine si es positivo, 
 * negativo o igual a cero.
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto9 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto9.class.getName());
    
    public static void main(String[] args) {
        logger.info("Ingrese un numero entero");
        int numero = sc.nextInt();

        String mensaje = "";

        if (numero < 0) {
            mensaje = " es un número negativo.";
        }
        
        if (numero > 0) {
            mensaje = " es un número positivo.";
        }

        if (numero == 0) {
            mensaje = " es igual a cero.";
        }

        logger.info(numero + mensaje);

        sc.close();
    }
}
