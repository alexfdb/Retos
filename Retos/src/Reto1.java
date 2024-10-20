package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que solicite al usuario un nombre de usuario y una 
 * contraseña. Si el nombre de usuario es "admin" y la contraseña es "1234", 
 * imprime "Acceso concedido". Si no, imprime "Acceso denegado". El programa 
 * debe permitir 3 intentos de inicio de sesión antes de bloquear el acceso.
 */
import java.util.Scanner;

public class Reto1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("Introduzca su nombre de usuario");
            String nombreUsuario = sc.nextLine();
            boolean validarNombre = nombreUsuario.equals("admin");

            System.out.println("Introduzca su contraseña");
            String contraseñaUsuario = sc.nextLine();
            boolean validarContraseña = contraseñaUsuario.equals("1234");

            if (validarNombre && validarContraseña) {
                System.out.println("Acceso concedido");
                break;
            } else {
                System.out.println("Acceso denegado" + (2 - intentos));
            }
        }
        
        sc.close();
    }
}
