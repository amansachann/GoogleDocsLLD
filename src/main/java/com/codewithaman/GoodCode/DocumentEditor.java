package com.codewithaman.GoodCode;

// Document Editor class for managing client interactions
public class DocumentEditor {

    private Document document;
    private Persistence persistence;
    private String renderedDocument;

    public DocumentEditor(Document document, Persistence persistence) {
        this.document = document;
        this.persistence = persistence;
        this.renderedDocument = "";
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    // Adds new line to the document
    public void addNewLine() {
        document.addElement(new NewLineElement());
    }

    // Add tab space to the document
    public void addTabSpace() {
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument() {
        if(renderedDocument.isEmpty()) {
            renderedDocument = document.render();
        }
        return renderedDocument;
    }

    public void saveDocument() {
        persistence.save(document);
    }
}
