package org.example;

import org.example.LibraryClass;
import org.example.UtilClass;

public class Main {
    public static void main(String[] args) {
        LibraryClass library = new LibraryClass();
        UtilClass util = new UtilClass();

        library.printMessage();
        util.printUtilMessage();

        int result = library.add(5, 3);
        util.logInfo("Result of addition: " + result);

        if (result < 0) {
            util.logError("Negative result detected!");
        } else {
            util.logInfo("Positive result detected.");
        }
    }
}
