package com.example;

import java.util.ArrayList;
import java.util.List;

public class MusicLabel {
    private List<Musician> musicians;

    public MusicLabel() {
        this.musicians = new ArrayList<>();
    }

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }

    public Musician findMusician(String name) throws MusicianNotFoundException {
        for (Musician m : musicians) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        throw new MusicianNotFoundException("Музыкант с именем " + name + " не найден на лейбле", name);
    }

    public void releaseAlbumFor(String name, String albumTitle) throws MusicianNotFoundException, AlbumException {
        Musician m = findMusician(name);
        m.releaseAlbum(albumTitle);
    }

    public void printAllMusicians() {
        for (Musician m : musicians) {
            System.out.println(m);
        }
    }
}