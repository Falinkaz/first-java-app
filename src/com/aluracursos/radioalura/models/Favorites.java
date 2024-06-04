package com.aluracursos.radioalura.models;

public class Favorites {

    public void add(Audio audio){
        if(audio.getClassification() >= 7){
            System.out.println(audio.getTitle() + " is one of the Top 100");
        } else {
            System.out.println(audio.getTitle() + " is a rising Title");
        }
    }
}
