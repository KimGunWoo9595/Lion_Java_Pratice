package com.company.day03.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt");
        String answer = "";
        char read = (char) reader.read();
        System.out.println("read = " + read);
    }

}
