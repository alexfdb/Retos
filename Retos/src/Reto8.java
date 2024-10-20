package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que solicite un año al usuario y determine si es bisiesto 
 * (divisible por 4, pero no por 100, excepto si es divisible por 400).
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto8 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto8.class.getName());

    public static void main(String[] args) {
        logger.info("Ingrese el año.");
        int anio = sc.nextInt();

        String mensaje;

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            mensaje = "El año " + anio + " es bisiesto.";
        } else {
            mensaje = "El año " + anio + " no es bisiesto.";
        }

        logger.info(mensaje);

        sc.close();
    }
    
}
