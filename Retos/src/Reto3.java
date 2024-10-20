package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Modifica el ejercicio de clasificación de edad para incluir una nueva categoría. 
 * Si el usuario tiene más de 65 años, imprime "Eres un adulto mayor".
 */
import java.util.Scanner;
public class Reto3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca su edad");
        byte edad = sc.nextByte();
        clasificarEdad(edad);
        sc.close();
    }

    static void clasificarEdad(byte edad) {
        if (edad < 10) {
            System.out.println("Eres un niño");
        }else if (edad < 20) {
            System.out.println("Eres adolescente");
        }else if (edad < 30) {
            System.out.println("Eres un adulto joven");
        } else if (edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
