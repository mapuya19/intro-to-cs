public class Complex extends Number {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real) {
        this.real = real;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double re() {
        return this.real;
    }

    public double im() {
        return this.imaginary;
    }

    public Complex conjugate() {
        return new Complex(this.real, -1*this.imaginary);
    }

    public Complex add(Complex comp) {
        return new Complex(this.real + comp.re(), this.imaginary + comp.im());
    }

    public Complex subtract(Complex comp) {
        return new Complex(this.real - comp.re(), this.imaginary - comp.im());
    }

    public Complex multiply(Complex comp) {
        if (this.imaginary == 0. || comp.im() == 0.) {
            return new Complex(this.real * comp.re());
        }

        return new Complex((this.real * comp.re()) - (this.imaginary * comp.im()),
                      (this.real * comp.im()) + (this.imaginary * comp.re()));
    }

    public Complex divide(Complex comp) {
        double compRealBottom = 0.0;
        if (comp.re() != 0.0)
            compRealBottom = Math.pow(comp.re(), 2);

        double compImagineBottom =  0.0;
        if (comp.im() != 0.0)
            compImagineBottom =  Math.pow(comp.im(), 2);

        double ac = this.real * comp.re();
        double bd = this.imaginary * comp.im();
        double bc = this.imaginary * comp.re();
        double ad = this.real * comp.im();

        return new Complex ((ac + bd) / (compRealBottom + compImagineBottom), (bc - ad) / (compRealBottom + compImagineBottom));
    }


    @Override
    public int intValue() {
        return Integer.parseInt(Double.toString(this.real));
    }

    @Override
    public double doubleValue() {
        return this.real;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(Double.toString(this.real));
    }

    @Override
    public long longValue() {
        return Long.parseLong(Double.toString(this.real));
    }
}
