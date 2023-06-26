package org.stepic.java.ascii_class;

public class AsciiCharSequence implements java.lang.CharSequence {

    private final byte[] chars;

    public AsciiCharSequence(byte[] chars) {
        this.chars = chars;
    }

    @Override
    public int length() {
        return chars.length;
    }

    @Override
    public char charAt(int index) {
        byte val = this.chars[index];
        return (char)val;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int len = end - start;
        byte[] subseq = new byte[len];

        System.arraycopy(this.chars, start, subseq, 0, len);

        return new AsciiCharSequence(subseq);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(byte chr : this.chars) {
            result.append((char)chr);
        }
        return result.toString();
    }
}
