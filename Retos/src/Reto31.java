package src;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea una clase Persona con los atributos nombre, edad y ocupación. 
 * Añade un método presentarse que imprima "Hola, mi nombre es [nombre], 
 * tengo [edad] años y soy [ocupación]".
 */
public class Reto31 {

    private String nombre;
    private int edad;
    private String ocupacion;

    /**
     * Constructor por defecto
     */
    public Reto31() {
        nombre = "";
        edad = 0;
        ocupacion = "";
    }

    /**
     * Constructor completo
     * @param nombre
     * @param edad
     * @param ocupacion
     */
    public Reto31(String nombre, int edad, String ocupacion) {
        setNombre(nombre);
        setEdad(edad);
        setOcupacion(ocupacion);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        validarEdad(edad);
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        validarOcupacion(ocupacion);
        this.ocupacion = ocupacion;
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null ni estar vacío");
        }
    }

    public void validarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa o igual a cero");
        }
    }

    public void validarOcupacion(String ocupacion) {
        if (ocupacion == null || ocupacion.trim().isEmpty()) {
            throw new IllegalArgumentException("La ocupación no puede ser null o estar vacía");
        }
    }

    /**
     * Método para presentarse, retornando nombre, edad y ocupación del objeto.
     * @return
     */
    public String presentacion() {
        return "Hola, mi nombre es " + nombre + ", tengo " + edad + " años y soy " + ocupacion + ".";
    }

    @Override
    public String toString() {
        return "Reto31{" +
               "Nombre: " + nombre +
               ", Edad: " + edad +
               ", Ocupación: " + ocupacion +
               '}';
    }

    public static void main(String[] args) {
        Reto31 persona1 = new Reto31("Alex", 29, "Estudiante");

        System.out.println(persona1.presentacion());
    }
}