/**
 * A <code>hello world</code> program
 *
 * @author nikita
 * @version 1.0
 */
package org.stepic.java.text_analyzer;

import org.stepic.java.ascii_class.AsciiCharSequence;

class Main {
    /**
     * Program main method
     *
     * @param args cli args
     */
    public static void main(String[] args) {
        SpamAnalyzer spam = new SpamAnalyzer(new String[] {"обэма", "путен"});
        NegativeTextAnalyzer negative = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLong = new TooLongTextAnalyzer(15);

        Label result = checkLabels
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (!label.equals(Label.OK))
                return label;
        }
        return Label.OK;
    }

    static class NegativeTextAnalyzer extends KeywordAnalyzer {

        @Override
        public Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }

        @Override
        public String[] getKeywords() {
            return new String[] {":(", "=(", ":|"};
        }
    }

    static class SpamAnalyzer extends KeywordAnalyzer{

        private final String[] keywords;
        SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        public Label getLabel() {
            return Label.SPAM;
        }

        @Override
        public String[] getKeywords() {
            return keywords;
        }
    }

    static class TooLongTextAnalyzer implements TextAnalyzer {

        private final int maxLength;

        TooLongTextAnalyzer(int length) {
            this.maxLength = length;
        }
        @Override
        public Label processText(String text) {
            return text.length() > this.maxLength ? Label.TOO_LONG : Label.OK;
        }
    }

}