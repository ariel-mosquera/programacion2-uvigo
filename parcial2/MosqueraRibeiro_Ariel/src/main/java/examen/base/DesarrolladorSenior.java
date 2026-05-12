package examen.base;

// Un DesarrolladorSenior tiene un máximo de 1600 horas.
// TODO ejercicio 2: sobreescribir toString() para añadir el sufijo "[Senior]".
public class DesarrolladorSenior extends Desarrollador {

    private boolean enAreaCritica;

    public DesarrolladorSenior(String nombre, String email, boolean enAreaCritica) {
        super(nombre, email);
        this.enAreaCritica = enAreaCritica;
    }

    @Override
    public int getHorasMaximas() {
        if (this.enAreaCritica)
            return 1400;
        else
            return 1600; 
    }

    @Override
    public String toString() {
        return super.toString() + "[Senior]";
    }
}
