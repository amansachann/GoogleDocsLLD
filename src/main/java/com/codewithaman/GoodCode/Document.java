package com.codewithaman.GoodCode;

import java.util.ArrayList;
import java.util.List;

// Document class is responsible for holding a collection of elements
public class Document {

    private List<DocumentElement> documentElements;

    public Document() {
        this.documentElements = new ArrayList<>();
    }

    public void addElement(DocumentElement element) {
        documentElements.add(element);
    }

    // Renders the document by concatenating the render output of all elements
    public String render() {
        StringBuilder result = new StringBuilder();
        for(DocumentElement element : documentElements) {
            result.append(element.render());
        }
        return result.toString();
    }
}
