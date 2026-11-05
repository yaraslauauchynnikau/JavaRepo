package com.example;

public class Musician {
    private String name;
    private String instrument;
    private String genre;
    private int albums;
    private double rating;

    public Musician(String name, String instrument, String genre, int albums, double rating) throws InvalidMusicianDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Имя музыканта не может быть пустым");
        }
        if (albums < 0) {
            throw new InvalidMusicianDataException("Количество альбомов не может быть отрицательным");
        }
        if (rating < 1.0 || rating > 10.0) {
            throw new InvalidMusicianDataException("Рейтинг должен быть от 1 до 10");
        }
        this.name = name;
        this.instrument = instrument;
        this.genre = genre;
        this.albums = albums;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getGenre() {
        return genre;
    }

    public int getAlbums() {
        return albums;
    }

    public double getRating() {
        return rating;
    }

    public void releaseAlbum(String title) throws AlbumException {
        if (title == null || title.trim().isEmpty()) {
            throw new AlbumException("Название альбома не может быть пустым");
        }
        albums++;
        System.out.printf("Музыкант %s выпустил новый альбом: \"%s\". Всего альбомов: %d%n", name, title, albums);
    }

    public void updateRating(double newRating) throws InvalidMusicianDataException {
        if (newRating < 1.0 || newRating > 10.0) {
            throw new InvalidMusicianDataException("Новый рейтинг должен быть от 1 до 10");
        }
        this.rating = newRating;
        System.out.printf("Рейтинг музыканта %s обновлен до %.1f%n", name, rating);
    }

    @Override
    public String toString() {
        return String.format("Музыкант: %s | Инструмент: %s | Жанр: %s | Альбомы: %d | Рейтинг: %.1f",
                name, instrument, genre, albums, rating);
    }
}