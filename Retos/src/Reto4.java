package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que solicite un número entero al usuario y determine si 
 * es par o impar usando una estructura if/else.
 */
import java.util.Scanner;

public class Reto4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el número que desee");
        int numeroIngresado = sc.nextInt();

        System.out.println("El numero " + numeroIngresado + " es " + verificarParidad(numeroIngresado));
    }

    public static String verificarParidad(int numeroIngresado) {
        if (numeroIngresado % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}
