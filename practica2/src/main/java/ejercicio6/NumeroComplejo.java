package ejercicio6;

public class NumeroComplejo {

    public static final NumeroComplejo UNO = new NumeroComplejo(1, 0);
    public static final NumeroComplejo CERO = new NumeroComplejo(0, 0);
    public static final NumeroComplejo I = new NumeroComplejo(0, 1);

    // private double parteRe;
    // private double parteIm;
    private double[] complejo = new double[2];

    public NumeroComplejo(double parteRe, double parteIm) {
        // this.parteRe = parteRe;
        // this.parteIm = parteIm;
        this.complejo[0] = parteRe;
        this.complejo[1] = parteIm;
    }

    public static NumeroComplejo real(double valor) {
        return new NumeroComplejo(valor, 0);
    }

    public static NumeroComplejo imaginario(double valor) {
        return new NumeroComplejo(0, valor);
    }

    public double getParteRe() {
        // return parteRe;
        return this.complejo[0];
    }

    public double getParteIm() {
        // return parteIm;
        return this.complejo[1];
    }

    static NumeroComplejo sumarComplejos(NumeroComplejo num1, NumeroComplejo num2) {
        double sumaReales = num1.getParteRe() + num2.getParteRe();
        double sumaImagin = num1.getParteIm() + num2.getParteIm();

        NumeroComplejo result = new NumeroComplejo(sumaReales, sumaImagin);

        return result;
    }

    static NumeroComplejo multiplicarPorReal(NumeroComplejo complejo, double real) {
        return new NumeroComplejo(complejo.getParteRe() * real, complejo.getParteIm() * real);
    }

    double calcularValorAbsoluto() {
        return Math.sqrt(getParteRe() * getParteRe() + getParteIm() * getParteIm());
    }

    @Override
    public String toString() {
        return "(" + getParteRe() + " + " + getParteIm() + "i" + ")";
    }

}