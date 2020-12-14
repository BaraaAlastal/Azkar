package com.example.azkar.Models;

public class AzkarList {
    private String title;
    private String numOfAzkar;
    private int image;

    public AzkarList() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumOfAzkar() {
        return numOfAzkar;
    }

    public void setNumOfAzkar(String numOfAzkar) {
        this.numOfAzkar = numOfAzkar;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public AzkarList(String title, String numOfAzkar, int image) {
        this.title = title;
        this.numOfAzkar = numOfAzkar;
        this.image = image;
    }
}
