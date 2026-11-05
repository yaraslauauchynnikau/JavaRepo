package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                MusicLabel label = new MusicLabel();

                try {
                    Musician m1 = new Musician("Ария", "Гитара", "Хеви-метал", 12, 9.5);
                    Musician m2 = new Musician("Кино", "Гитара", "Рок", 8, 10.0);
                    Musician m3 = new Musician("Мельница", "Арфа", "Фолк", 7, 8.8);

                    label.addMusician(m1);
                    label.addMusician(m2);
                    label.addMusician(m3);

                    System.out.println("=== Список музыкантов лейбла ===");
                    label.printAllMusicians();
                    System.out.println();

                    System.out.println("=== Выпуск альбомов ===");
                    label.releaseAlbumFor("Кино", "Звезда по имени Солнце");
                    label.releaseAlbumFor("Ария", "Кровь за кровь");
                    System.out.println();

                    System.out.println("=== Обновление рейтинга ===");
                    m1.updateRating(9.8);
                    System.out.println();

                    System.out.println("=== Обработка ошибок ===");

                    try {
                        label.releaseAlbumFor("Кино", "");
                    } catch (AlbumException e) {
                        System.out.println("Ошибка альбома: " + e.getMessage());
                    }

                    try {
                        label.releaseAlbumFor("ДДТ", "Прозрачный");
                    } catch (MusicianNotFoundException e) {
                        System.out.println("Ошибка поиска: " + e.getMessage() + " (Искомое имя: " + e.getName() + ")");
                    }

                    try {
                        m2.updateRating(11.0);
                    } catch (InvalidMusicianDataException e) {
                        System.out.println("Ошибка данных: " + e.getMessage());
                    }

                    try {
                        Musician m4 = new Musician("", "Барабаны", "Джаз", 1, 5.0);
                    } catch (InvalidMusicianDataException e) {
                        System.out.println("Ошибка создания: " + e.getMessage());
                    }

                } catch (InvalidMusicianDataException e) {
                    System.out.println("Ошибка при инициализации данных: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Неизвестная ошибка: " + e.getMessage());
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}