package src;
import java.net.Socket;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que calcule el impuesto basado en los ingresos anuales 
 * ingresados por el usuario. Si el ingreso es menor a 30,000, no hay impuesto. 
 * Si es entre 30,000 y 100,000, el impuesto es del 10%. Si es mayor a 100,000, 
 * el impuesto es del 20%.
 */
import java.util.Scanner;

public class Reto2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca sus ingresos anuales");
        float ingresoAnual = sc.nextFloat();

        float impuesto;
        boolean impuesto0 = ingresoAnual < 30000;
        boolean impuesto10 = ingresoAnual < 100000 && ingresoAnual > 30000;

        if (impuesto0) {
            impuesto = ingresoAnual *  0f;
        } else if (impuesto10) {
            impuesto = ingresoAnual * 0.1f;
        } else {
            impuesto = ingresoAnual * 0.2f;
        }

        System.out.println("El usuario paga " + impuesto + " porque sus ingresos anuales fueron " + ingresoAnual + '$');

        sc.close();
    }
}
