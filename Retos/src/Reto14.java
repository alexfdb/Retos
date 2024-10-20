package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que busque un valor específico dentro de un 
 * array de 10 números enteros e imprima si se encuentra o no.
 */
import java.util.Scanner;
public class Reto14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuantos números desea ingresar?");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1) + ':');
            numeros[i] = sc.nextInt();
        }

        System.out.println("Ingrese el número que desea buscar");
        int numeroBuscar = sc.nextInt();

        String mensaje = "";
        int posicion = 0;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                posicion = i + 1;
                mensaje = "El " + numeroBuscar + " se encuentra en la posición " + posicion + '.';
                encontrado = true;
            }
        }

        if (!encontrado){
            mensaje = "El " + numeroBuscar + " no se encuentra";
        }

        System.out.println(mensaje);

        sc.close();
    }
}
