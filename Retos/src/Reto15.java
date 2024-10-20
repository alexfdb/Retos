package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que invierta los elementos de un array de 
 * 5 cadenas de texto y muestre los elementos en orden inverso.
 */
public class Reto15 {

    public static void main(String[] args) {
        String[] cadenaTexto = {"Hola", "Cara", "co", "la", "."};

        for (int i = cadenaTexto.length - 1; i >= 0; i--){
            System.out.print(cadenaTexto[i] + " ");
        }
    }
}
