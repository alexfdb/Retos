package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Solicita tres números al usuario y determina cuál de los tres es el mayor, 
 * cuál es el menor, o si son iguales.
 */
import java.util.Scanner;

public class Reto5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese tres numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        int mayor = numero1;
        int menor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Son todos iguales");
        } else {
            System.out.println("El mayor es el número " + mayor);
            System.out.println("El menor es el número " + menor);
        }

        sc.close();
    }
}
