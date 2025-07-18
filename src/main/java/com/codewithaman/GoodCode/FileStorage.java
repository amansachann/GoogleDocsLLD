package com.codewithaman.GoodCode;

import java.io.FileWriter;
import java.io.IOException;

// File storage implementation of persistence
public class FileStorage implements Persistence{
    @Override
    public void save(Document document) {
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write(document.render());
            writer.close();
            System.out.println("Document saved to file document.txt");

        } catch (IOException e) {
            System.err.println("Error saving document to file:" + e.getMessage());
        }
    }
}
