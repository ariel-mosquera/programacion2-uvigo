package ejercicio1;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    Date(int day, int month, int year) {
        if (year < 0)
            throw new IllegalArgumentException();

        int maxDays = getDaysInMonth(month, year);

        if (day < 0 || day > maxDays)
            throw new IllegalArgumentException();

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Mes inválido: " + month);
        };
    }
}