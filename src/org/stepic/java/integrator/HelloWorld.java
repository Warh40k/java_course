/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.integrator;

import java.util.function.DoubleUnaryOperator;

public class HelloWorld {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        final double h = 10e-6;

        double l = a;
        double result = 0;

        while (l <= b) {
            result += h * f.applyAsDouble(l);
            l += h;
        }

        return result;
    }

}