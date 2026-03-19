package ejercicio4;

import java.lang.IllegalArgumentException;

/* Crea una clase Deportista, con un dni, un nombre, una edad y una categoría, que va a ir cambiando a lo largo del tiempo con los cambios de edad. Los valores de la categoría son: benjamín, alevín, infantil, cadete, juvenil y senior (debes emplear un enumerado), con los siguientes rangos de edad: 

Categoría:	Edad:
Benjamín	≤ 8 años
Alevín	    9-10 años
Infantil	11-12 años
Cadete	    13-14 años
Juvenil	    15-18 años
Sénior	    > 18 años

Implementa la clase como una clase mutable en lo necesario y haz las comprobaciones necesarias empleando excepciones. Fíjate que no es necesario añadir el atributo para categoría (se deduce de la edad), haz que el método getCategoria la calcule directamente.

Crea algunos tests unitarios para comprobar los casos de exito y los casos excepcionales.*/

public class Deportista {

    private String dni;
    private String nombre;
    private int edad;

    Deportista(String dni, String nombre, int edad) throws IllegalArgumentException {
        setDni(dni);
        setNombre(nombre);
        setEdad(edad);
    }

    public void setDni(String dni) throws IllegalArgumentException {
        if (dni == null || dni.equals("") || dni.length() != 9)
            throw new IllegalArgumentException("DNI inválido");

        this.dni = dni;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.equals(""))
            throw new IllegalArgumentException("nombre inválido");

        this.nombre = nombre;
    }

    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0)
            throw new IllegalArgumentException();

        this.edad = edad;
    }

    public Categoria getCategoria() {
        if (edad <= 8)
            return Categoria.BENJAMIN;
        if (edad <= 10)
            return Categoria.ALEVIN;
        if (edad <= 12)
            return Categoria.INFANTIL;
        if (edad <= 14)
            return Categoria.CADETE;
        if (edad <= 18)
            return Categoria.JUVENIL;
        else
            return Categoria.SENIOR;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
}
