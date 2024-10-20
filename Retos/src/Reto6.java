package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que calcule el descuento de una compra en función del 
 * monto total. Si el monto es mayor a 500, aplica un 10% de descuento. Si es 
 * menor, no aplica descuento.
 */
import java.util.Scanner;

public class Reto6 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de su compra");
        float valorCompra = sc.nextFloat();

        String mensaje;
        float calculoDescuento;
        float restaDescuento;

        if (valorCompra > 500) {
            calculoDescuento = valorCompra * 0.1f;
            restaDescuento = valorCompra - calculoDescuento;
            mensaje = "Se descontará " + calculoDescuento + " del total por haber superado los 500$, total a pagar: " + restaDescuento;
            
        } else {
            mensaje = "No aplica descuento";
        }

        System.out.println(mensaje);

        sc.close();
    }
}
