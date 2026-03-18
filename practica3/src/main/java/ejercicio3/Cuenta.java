package ejercicio3;

/* Sea la clase Cuenta (bancaria), que tiene un saldo en euros, y permite ingresar y retirar. Las cuentas se pueden crear con un saldo inicial. Los objetos de la clase Cuenta nunca deben tener saldo negativo. Implementa una clase mutable que mantenga la invariante de clase, de forma que no se pueda corromper su estado interno, lanzando excepciones para impedirlo.

No crees un método main en este ejercicio, sino que crea dos tests de unidad para Cuenta para casos de un uso habitual y otros dos tests donde se compruebe la respuesta si se intenta violar la invariante de clase. */

import java.lang.IllegalArgumentException;

public class Cuenta {

    private double saldo;

    Cuenta(double saldo) throws IllegalArgumentException {
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws IllegalArgumentException {
        if (saldo < 0)
            throw new IllegalArgumentException("Error, no se admite un saldo negativo");

        this.saldo = saldo;
    }
}
