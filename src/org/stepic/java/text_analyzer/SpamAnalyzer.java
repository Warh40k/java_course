package org.stepic.java.text_analyzer;

class SpamAnalyzer extends KeywordAnalyzer{

    private final String[] keywords;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
        Throwable
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }
}
