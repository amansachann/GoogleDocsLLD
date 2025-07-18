package com.codewithaman.GoodCode;

// Concrete implementation for Image elements
public class ImageElement implements DocumentElement{

    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return "[Image: " + imagePath + "]";
    }
}
