package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que elimine los números duplicados en un array de 10 
 * números enteros, dejando solo los valores únicos.
 */
public class Reto19 {
    public static void main(String[] args) {
        Integer[] numeros = {1, 3, 5, 2, 5, 3, 4, 3, 2, 2};

        boolean[] validados = new boolean[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            if (!validados[i]) {
                validados[i] = true;

                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i].equals(numeros[j])) {
                        numeros[j] = null;
                        validados[j] = true;
                    }
                }
            }
        }

        System.out.println("Números únicos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != null) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}