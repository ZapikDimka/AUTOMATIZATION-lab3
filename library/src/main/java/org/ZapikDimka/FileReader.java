package org.ZapikDimka;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public String readFile(String filePath) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
