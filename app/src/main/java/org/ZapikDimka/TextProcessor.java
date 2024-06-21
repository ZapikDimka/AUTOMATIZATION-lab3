package org.ZapikDimka;

import org.ZapikDimka.TextUtils;

public class TextProcessor {
    private final TextUtils textUtils;

    public TextProcessor(TextUtils textUtils) {
        this.textUtils = textUtils;
    }

    public String processText(String text) {
        // Perform some text processing, e.g., convert to uppercase
        return textUtils.convertToUpper(text);
    }
}
