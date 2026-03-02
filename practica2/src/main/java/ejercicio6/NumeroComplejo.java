package ejercicio6;

public class NumeroComplejo {

    private double parteRe;
    private double parteIm;

    public NumeroComplejo(double parteRe, double parteIm) {
        this.parteRe = parteRe;
        this.parteIm = parteIm;
    }

    public double getParteRe() {
        return parteRe;
    }

    public double getParteIm() {
        return parteIm;
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
        return Math.sqrt(this.parteRe * this.parteRe + this.parteIm * this.parteIm);
    }

    @Override
    public String toString() {
        return "(" + this.parteRe + " + " + this.parteIm + "i" + ")";
    }

}