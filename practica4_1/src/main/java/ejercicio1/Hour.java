package ejercicio1;

public class Hour {
    private final int hour;
    private final int minuts;

    public Hour(int hour, int minuts) throws IllegalArgumentException {
        if (hour < 0 || hour > 23 || minuts < 0 || minuts > 59)
            throw new IllegalArgumentException();

        this.hour = hour;
        this.minuts = minuts;
    }

    public int getHour() {
        return hour;
    }

    public int getMinuts() {
        return minuts;
    }
}
