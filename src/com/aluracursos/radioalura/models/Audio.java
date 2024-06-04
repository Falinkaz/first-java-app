package com.aluracursos.radioalura.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int totalLikes;
    private int classification;

    public void like(){
        this.totalLikes++;
    }

    public void play (){
        this.totalPlays++;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }
}
