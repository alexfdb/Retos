package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que sume los elementos de 
 * cada fila de un array bidimensional 3x3.
 */
public class Reto25 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = (i + 1) + (j + 1); 
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
