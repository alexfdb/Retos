package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de números enteros 
 * y cuente cuántas veces aparece cada número.
 */
public class Reto29 {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 3, 2, 4, 3, 5, 6};

        boolean[] verificarContados = new boolean[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            if (!verificarContados[i]) {
                int conteo = 1;
                verificarContados[i] = true;

                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        conteo++;
                        verificarContados[j] = true; 
                    }
                }

                String vez = (conteo == 1) ? "vez" : "veces";
                System.out.println(numeros[i] + " aparece " + conteo + " " + vez + ".");
            }
        }
    }
}