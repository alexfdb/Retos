package src;
/**
 * @autor alexfdb
 * @version 1.0.0
 * Escribe un programa que solicite una calificación y la clasifique en "Aprobado" 
 * o "Reprobado". Si la calificación es mayor o igual a 60, está aprobada; si es 
 * menor, está reprobada.
 */
import java.util.Scanner;

public class Reto7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese su calificación");
        float calificacion = sc.nextFloat();

        String mensaje;

        if (calificacion < 60) {
            mensaje = "Reprobado";
        } else {
            mensaje = "Aprobado";
        }

        System.out.println(mensaje);

        sc.close();
    }
}
