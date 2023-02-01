package com.example.fourthprofile;

public class GridModel {
    String title, color_description, price;
    int image;

    public GridModel(String title, String color_description, String price, int image) {
        this.title = title;
        this.color_description = color_description;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor_description() {
        return color_description;
    }

    public void setColor_description(String color_description) {
        this.color_description = color_description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
