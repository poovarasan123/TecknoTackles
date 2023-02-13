package com.techno_tackle;

import android.graphics.drawable.Drawable;

public class Items {

    int image;
    String name, description, rating, quotes;

    public Items(int image, String name, String description, String rating, String quotes) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.quotes = quotes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}
