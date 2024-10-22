package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de 5 palabras 
 * y determine cuál es la palabra más larga.
 */
public class Reto23 {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "Mundo", "Como", "Estas", "Hoy"};
        String palabraMayor = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMayor.length()) {
                palabraMayor = palabras[i];
            }
        }
        
        System.out.println("'" + palabraMayor + "'" + " es la mayor palabra del array.");
    }
}
