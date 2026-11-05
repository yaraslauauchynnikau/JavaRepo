package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Singer jotaro = new Singer("Джотаро", Genre.JAZZ);
                jotaro.addSong("Йорё-блюз", Genre.JAZZ);
                jotaro.addSong("Ора-ора", Genre.ROCK);
                jotaro.addSong("Стоп-тайм", Genre.POP);

                Singer rohan = new Singer("Рохан", Genre.ROCK);
                rohan.addSong("Хигашиката", Genre.ROCK);
                rohan.addSong("Небесная дверь", Genre.ROCK);

                Singer okuyasu = new Singer("Окуясу", Genre.POP);
                okuyasu.addSong("За-хендо", Genre.POP);

                Singer gnidkins = new Singer("Гнидкинс", Genre.FOLK);

                Singer knight = new Singer("Рыцарь", Genre.CLASSICAL);
                knight.addSong("Мост", Genre.CLASSICAL);
                knight.addSong("Падение", Genre.CLASSICAL);
                knight.addSong("Доспех", Genre.CLASSICAL);
                knight.addSong("Копьё", Genre.CLASSICAL);

                Singer[] singers = { jotaro, rohan, okuyasu, gnidkins, knight };

                for (Singer s : singers) {
                    System.out.printf("%s (%s), песен: %d%n",
                            s.getName(), s.getGenre(), s.getSongs().size());
                    for (Song song : s.getSongs()) {
                        System.out.printf("   - \"%s\" [%s], автор: %s%n",
                                song.getTitle(), song.getGenre(), song.getAuthor().getName());
                    }
                }

                System.out.println();
                System.out.println("Всего певцов: " + Singer.totalSingers);
                System.out.println("Всего песен: " + Singer.totalSongs);
                System.out.printf("В среднем песен на певца: %.2f%n", Singer.getAverageSongs());
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}