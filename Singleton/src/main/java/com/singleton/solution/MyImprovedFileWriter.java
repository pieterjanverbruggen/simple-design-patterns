package com.singleton.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyImprovedFileWriter {

    public static final String filename = "./Singleton/logfile_solution.log";
    private File file;
    private FileWriter writer;
    private static MyImprovedFileWriter instance;

    public static MyImprovedFileWriter getInstance() {
        if (instance == null) {
            instance = new MyImprovedFileWriter();
        }
        return instance;
    }

    private MyImprovedFileWriter() {
        createFile();
    }

    private void createFile() {
        File myObj = new File(filename);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File " + myObj.getName() + " already exists.");
            }
            writer = new FileWriter(filename, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile (String message) throws IOException {
        writer.write(message + "\n");
        writer.flush();
        System.out.println("Successfully wrote to " + filename + ".");
    }
}
