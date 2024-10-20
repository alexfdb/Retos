package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Solicita la edad del usuario e imprime su categoría: "Niño" (0-12 años), 
 * "Adolescente" (13-17 años), "Adulto" (18-64 años), o "Adulto mayor" (65+ años).
 */
import java.util.Scanner;
import java.util.logging.Logger;

public class Reto10 {
    static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Reto10.class.getName());

    public static void main(String[] args) {
        logger.info("Ingrese su edad.");
        byte edad = sc.nextByte();

        String mensaje = "";

        if (edad >= 12) {
            mensaje = "niño";
        }

        if (edad >= 13 && edad <= 17) {
            mensaje = "adolescente";
        }

        if (edad >= 18 && edad <= 64) {
            mensaje = "adulto";
        }

        if (edad >= 65) {
            mensaje = "adulto mayor";
        }

        logger.info("Usted es " + mensaje + " porque su edad es " + edad + '.');

        sc.close();
    }
}
