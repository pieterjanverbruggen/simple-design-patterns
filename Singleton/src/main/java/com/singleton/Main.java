package com.singleton;

import com.singleton.problem.MyFileWriter;
import com.singleton.solution.MyImprovedFileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private static void risk() throws IOException {
        // Two separate writer instances are created
        MyFileWriter w1 = new MyFileWriter();
        MyFileWriter w2 = new MyFileWriter();
        // And write a message to the same file
        w1.writeToFile("w1 says Hi!");
        w2.writeToFile("w2 says Hi there!");
        // All of this works fine but it can get messy in larger programs
    }

    private static void solution() throws IOException {
        // Two separate writer instances are created

        // MyImprovedFileWriter w1 = MyImprovedFileWriter.getInstance();
        // MyImprovedFileWriter w2 = MyImprovedFileWriter.getInstance();

        // And write a message to the same file

        // w1.writeFile("w1 says Hi!");
        // w2.writeFile("w2 says Hi there!");

        // All of this works fine but it can get messy in larger programs
    }

    public static void main(String[] args) {
        System.out.println("Start of the program");
        try {
            Files.deleteIfExists(Paths.get(MyFileWriter.filename));
            Files.deleteIfExists(Paths.get(MyImprovedFileWriter.filename));
            risk();
            solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}