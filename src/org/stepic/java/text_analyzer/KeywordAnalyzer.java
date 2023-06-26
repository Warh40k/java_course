package org.stepic.java.text_analyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword))
                return this.getLabel();
        }
        return Label.OK;
    }
}
