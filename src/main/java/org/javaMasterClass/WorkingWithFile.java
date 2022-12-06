package org.javaMasterClass;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFile {
    public static void main(String[] args) {
        File file = createFile("src/text.txt");
        writeFile(file, true);
        try {
            readFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void readFile(File file) throws FileNotFoundException {
        try {
            Scanner scaner = new Scanner(file);
            while (scaner.hasNext()) {
                System.out.println(scaner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
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
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println("This is a test");
        } catch (IOException e) {

            System.out.println( e.getMessage());
        }

    }
}
