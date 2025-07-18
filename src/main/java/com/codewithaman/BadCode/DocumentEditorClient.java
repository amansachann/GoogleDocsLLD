package com.codewithaman.BadCode;

public class DocumentEditorClient {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.addText("Hello, world!");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor.");

        System.out.println(editor.renderDocument());

        editor.saveToFile();
    }
}
