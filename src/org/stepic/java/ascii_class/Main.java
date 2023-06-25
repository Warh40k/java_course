/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.ascii_class;

import java.util.function.DoubleUnaryOperator;

public class Main {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {
        byte[] chars = new byte[] {111,112,113,124,125};
        AsciiCharSequence charSeq = new AsciiCharSequence(chars);
        System.out.printf("%s\n%s\n%s\n%d", charSeq.toString(),charSeq.charAt(3),charSeq.subSequence(2,5), charSeq.length());
    }

}