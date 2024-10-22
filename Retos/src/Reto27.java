package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un array de 5 palabras y determine 
 * si una palabra específica se encuentra dentro del array.
 */
public class Reto27 {
    public static void main(String[] args) {
        String[] palabras = {"hola", "mundo", "como", "estas", "hoy"};

        String palabraBuscar = "mundo";
        int posision = 0;
        String mensaje = "";

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabraBuscar)) {
                posision = i + 1;
                mensaje = "La palabra " + "'" + palabraBuscar + "'" + " se encuentra en la posisión " + posision + " del array.";
                break;
            } else {
                mensaje = "La palabra " + "'" + palabraBuscar + "'" + " no se encuentra en el array.";
            }
        }

        System.out.println(mensaje);
    }
}
