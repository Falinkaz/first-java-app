package com.aluracursos.radioalura.models;

public class Podcast extends Audio{
    private String author;
    private String description;

    @Override
    public int getClassification() {
        if (getTotalPlays() >= 2000){
            return 9;
        } else {
            return 2;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
