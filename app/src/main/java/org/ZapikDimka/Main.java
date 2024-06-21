package org.ZapikDimka;

import org.ZapikDimka.FileReader;
import org.ZapikDimka.FileWriter;
import org.ZapikDimka.AppLogger;
import org.ZapikDimka.TextUtils;

public class Main {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();
        TextUtils textUtils = new TextUtils();

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            logger.logInfo("Reading text from " + inputFilePath);
            String text = fileReader.readFile(inputFilePath);
            logger.logInfo("Original Text: " + text);

            logger.logInfo("Processing text...");
            TextProcessor textProcessor = new TextProcessor(textUtils);
            String processedText = textProcessor.processText(text);
            logger.logInfo("Processed Text: " + processedText);

            logger.logInfo("Writing processed text to " + outputFilePath);
            fileWriter.writeFile(outputFilePath, processedText);
            logger.logInfo("Text processing completed successfully.");
        } catch (Exception e) {
            logger.logError("An error occurred: " + e.getMessage());
        }
    }
}
