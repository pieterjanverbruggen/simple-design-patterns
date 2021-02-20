package com.singleton.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyImprovedFileWriter {

    public static final String filename = "./Singleton/logfile_solution.log";
    private File file;
    private FileWriter writer;

    /**
     * TODO Change this to a Singleton pattern so that no double file is create
     * Clearly you cannot change the code in main
     * And also cannot built an extra check for file existence in this class
     */

    public static MyImprovedFileWriter getInstance() {
        MyImprovedFileWriter myImprovedFileWriter = new MyImprovedFileWriter();
        return myImprovedFileWriter;
    }

    public MyImprovedFileWriter() {
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
