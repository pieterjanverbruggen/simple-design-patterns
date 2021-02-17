package com.singleton.problem;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class MyFileWriter {

    public static final String filename = "./Singleton/logfile_problem.log";
    File file;
    FileWriter writer;

    public MyFileWriter() throws IOException {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File " + myObj.getName() + " already exists.");
            }
            writer = new FileWriter(filename, true);
    }

    public void writeToFile(String message) throws IOException {
        writer.write(message + "\n");
        writer.flush();
        System.out.println("Successfully wrote to " + filename + ".");
    }
}