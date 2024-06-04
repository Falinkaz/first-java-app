package com.aluracursos.radioalura.main;

import com.aluracursos.radioalura.models.Favorites;
import com.aluracursos.radioalura.models.Podcast;
import com.aluracursos.radioalura.models.Song;

public class main {

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Espresso");
        song1.setArtist("Sabrina Carpenter");

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("Classy with Jonathan Menjivar");
        podcast1.setAuthor("Jonathan Menjivar");

        //Songs stats

        for (int i = 0; i < 15000; i++) {
            song1.like();
        }

        for (int i = 0; i < 200; i++) {
            song1.play();
        }

        //Podcast stats

        for (int i = 0; i < 8000; i++) {
            podcast1.like();
        }

        for (int i = 0; i < 200; i++) {
            podcast1.play();
        }

        System.out.println("Total Plays: " + song1.getTotalPlays());
        System.out.println("Total Likes: " + song1.getTotalLikes());

        Favorites favorite = new Favorites();
        favorite.add(podcast1);
        favorite.add(song1);
    }
}
