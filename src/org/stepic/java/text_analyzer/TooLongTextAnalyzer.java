package org.stepic.java.text_analyzer;

class TooLongTextAnalyzer implements TextAnalyzer {

    private final int maxLength;

    public TooLongTextAnalyzer(int length) {
        this.maxLength = length;
    }
    @Override
    public Label processText(String text) {
        return text.length() > this.maxLength ? Label.TOO_LONG : Label.OK;
    }
}
