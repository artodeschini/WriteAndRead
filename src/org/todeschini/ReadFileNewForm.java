package org.todeschini;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileNewForm {
    public static void main(String[] args) {
        //the path to
        String path = System.getProperty("user.home");

        // The name of the file to open.
        String fileName =  path + "/java_new.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println( line );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
