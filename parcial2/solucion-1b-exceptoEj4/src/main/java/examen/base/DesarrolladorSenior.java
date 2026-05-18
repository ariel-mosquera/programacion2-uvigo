package examen.base;

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
