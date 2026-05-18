package examen.base;

public class DesarrolladorJunior extends Desarrollador {

    private boolean tieneMentor;

    public DesarrolladorJunior(String nombre, String email, boolean tieneMentor) {
        super(nombre, email);
        this.tieneMentor = tieneMentor;
    }

    @Override
    public int getHorasMaximas() {
        if (this.tieneMentor)
            return 400;
        else
            return 250;
    }

    @Override
    public String toString() {
        return super.toString() + "[Junior]";
    }
}
