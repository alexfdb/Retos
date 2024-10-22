package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que cree un array bidimensional 
 * de 3x3 para representar una tabla de multiplicación.
 */
public class Reto24 {
    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int[9][9];

        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar.length; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Tabla de multiplicar: ");

        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar.length; j++) {
                System.out.print(tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
