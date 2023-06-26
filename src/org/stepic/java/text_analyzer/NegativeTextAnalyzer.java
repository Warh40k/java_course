package org.stepic.java.text_analyzer;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return new String[] {":(", "=(", ":|"};
    }
}
