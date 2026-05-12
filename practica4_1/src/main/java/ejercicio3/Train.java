package ejercicio3;

public class Train {
    private int horsePower;
    private Carriage firstCarriage;

    public Train(int horsePower, Carriage firstCarriage) {
        this.horsePower = horsePower;
        setFirstCarriage(firstCarriage);
    }

    public void setFirstCarriage(Carriage firstCarriage) {
        this.firstCarriage = firstCarriage;
    }

    public int getNumOfCarriages() {
        if (this.firstCarriage == null)
            return 0;
        else
            return this.firstCarriage.howManyFollows() + 1;
    }
}
