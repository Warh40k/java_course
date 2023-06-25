package org.stepic.java.hash_override;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

//    public boolean equals(Object obj) {
//        return (obj instanceof ComplexNumber) && (((ComplexNumber)obj).re == this.re) && (((ComplexNumber)obj).im == this.im);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber number = (ComplexNumber) o;
        return Double.compare(number.re, re) == 0 && Double.compare(number.im, im) == 0;
    }


//    public int hashCode() {
//        return 31 * Double.hashCode(this.re) + Double.hashCode(this.im);
//    }


    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
