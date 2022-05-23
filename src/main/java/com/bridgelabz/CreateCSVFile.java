package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class CreateCSVFile {
    public static String FILE_PATH = "C:\\Users\\Hp\\IdeaProjects\\CSVFileProject\\src\\main\\resources\\User.txt";

    public static void main(String[] args) throws IOException {

        createFile();

    }

    public static void createFile() throws IOException {

        File file = new File(FILE_PATH);

        if (file.createNewFile()){
            System.out.println("File created "+ file.getName());
        }else {
            System.out.println("File exist "+ file.getName());
        }
    }
}
