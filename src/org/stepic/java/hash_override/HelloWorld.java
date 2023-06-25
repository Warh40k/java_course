/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.hash_override;

public class HelloWorld {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {
        // simple code
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(1, 1);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());

    }

}