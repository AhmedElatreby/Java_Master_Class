package org.javaMasterClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WorkingWithFile {
    public static void main(String[] args) {
        File file = createFile("src/text.txt");
        writeFile(file, true);

    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            e.getMessage();
            throw new IllegalStateException(e);
        }

    }

    private static void writeFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("This is a test");
            writer.flush();
            writer.close();
//            write.write(d);
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
