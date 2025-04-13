package oefz1;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public Complex Add(Complex getal1, Complex getal2 ){
        Complex sum = new Complex();
        sum.setReal(getal1.getReal() + getal2.getReal());
        sum.setImaginary(getal1.getImaginary() + getal2.getImaginary());
        return sum;
    }

    @Override
    public String toString() {
    return "oefz1.Complex{" + "real=" + getReal() + ", imaginary=" + getImaginary() + '}';

    }
}
