package org.todeschini;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileNewForm {

    public static void main(String[] args) {
        //the path to
        String path = System.getProperty("user.home");

        // The name of the file to open.
        String fileName =  path + "/java_new.txt";

        String content =
                "Hello there," +
                " here is some text. In the same line\n" +
                "We are writing" +
                " the text to the file. Another line";

        try {
            Files.write(Paths.get(fileName), content.getBytes() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
