package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que reciba un array de 5 números enteros y un número adicional. 
 * El programa debe multiplicar cada elemento del array por el número adicional y 
 * devolver el nuevo array.
 */
public class Reto20 {
    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3, 4, 5};
        int numeroAdicional = 4;
        int[] numerosMultiplicados4 = new int[numeros1.length];

        for (int i = 0; i < numeros1.length; i++) {
            numerosMultiplicados4[i] = numeros1[i] * numeroAdicional;

            System.out.print(numerosMultiplicados4[i] + " ");
        }
    }


    
}
