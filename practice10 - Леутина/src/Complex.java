public class Complex {
    private int re = 0;
    private int im = 0;

    public Complex(int real, int imag) {
        re = real;
        im = imag;
    }

    public Complex() {
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

}
