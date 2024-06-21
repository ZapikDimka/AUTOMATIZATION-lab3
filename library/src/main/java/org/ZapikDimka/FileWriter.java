package org.ZapikDimka;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void writeFile(String filePath, String content) throws Exception {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
