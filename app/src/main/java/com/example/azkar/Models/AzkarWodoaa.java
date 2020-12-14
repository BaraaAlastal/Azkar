package com.example.azkar.Models;

public class AzkarWodoaa {

    private String doaaName;
    private String numOfDoaa;
    private String add2Favourite;
    private int favourite_img;

    public AzkarWodoaa() {
    }

    public String getDoaaName() {
        return doaaName;
    }

    public void setDoaaName(String doaaName) {
        this.doaaName = doaaName;
    }

    public String getNumOfDoaa() {
        return numOfDoaa;
    }

    public void setNumOfDoaa(String numOfDoaa) {
        this.numOfDoaa = numOfDoaa;
    }

    public String getAdd2Favourite() {
        return add2Favourite;
    }

    public void setAdd2Favourite(String add2Favourite) {
        this.add2Favourite = add2Favourite;
    }

    public int getFavourite_img() {
        return favourite_img;
    }

    public void setFavourite_img(int favourite_img) {
        this.favourite_img = favourite_img;
    }



    public AzkarWodoaa(String doaaName, String numOfDoaa, String add2Favourite, int favourite_img) {
        this.doaaName = doaaName;
        this.numOfDoaa = numOfDoaa;
        this.add2Favourite = add2Favourite;
        this.favourite_img = favourite_img;
    }
}
