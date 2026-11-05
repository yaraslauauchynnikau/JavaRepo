package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Map<String, Game> games = new LinkedHashMap<>();
                games.put("Шахматы", new BoardGame("Шахматы", 1, 5, 2));
                games.put("Монополия", new BoardGame("Монополия", 2, 4, 4));
                games.put("Каркассон", new BoardGame("Каркассон", 3, 5, 5));
                games.put("Уно", new CardGame("Уно", 4, 3, "стандартная"));
                games.put("Покер", new CardGame("Покер", 5, 5, "52 карты"));
                games.put("Блэкджек", new CardGame("Блэкджек", 6, 4, "52 карты"));
                games.put("Ведьмак 3", new VideoGame("Ведьмак 3", 7, 5, "PC"));
                games.put("Minecraft", new VideoGame("Minecraft", 8, 5, "PC"));

                for (Map.Entry<String, Game> entry : games.entrySet()) {
                    System.out.println("Ключ: " + entry.getKey());
                    entry.getValue().displayInfo();
                    System.out.println();
                }
                break;
            }

            case "-t2": {
                List<Doctor> doctors = new ArrayList<>();
                doctors.add(new Doctor(1, "Иванов", "Терапевт", 3, Arrays.asList(4, 5, 2, 3)));
                doctors.add(new Doctor(2, "Петров", "Хирург", 4, Arrays.asList(5, 5, 4, 5)));
                doctors.add(new Doctor(3, "Сидоров", "Кардиолог", 2, Arrays.asList(2, 1, 3, 2)));
                doctors.add(new Doctor(4, "Кузнецов", "Невролог", 3, Arrays.asList(3, 4, 3, 4)));
                doctors.add(new Doctor(5, "Смирнов", "Окулист", 1, Arrays.asList(1, 2, 1, 1)));

                System.out.println("=== Врачи со средним рейтингом < 3 ===");
                for (Doctor d : doctors) {
                    if (d.getAverageRating() < 3) {
                        System.out.println(d);
                    }
                }

                System.out.println();
                System.out.println("=== Повышение рейтинга для врачей со средним >= 4 ===");
                for (Doctor d : doctors) {
                    if (d.getAverageRating() >= 4) {
                        d.setRating(Math.min(5, d.getRating() + 1));
                        System.out.println("Повышен рейтинг: " + d.getName() + " -> " + d.getRating());
                    }
                }

                System.out.println();
                System.out.println("=== Печать врачей с рейтингом 4 ===");
                printDoctors(doctors, 4);

                System.out.println();
                System.out.println("=== Сортировка по убыванию среднего рейтинга ===");
                doctors.sort(Comparator.comparingDouble(Doctor::getAverageRating).reversed()
                        .thenComparing(Doctor::getName));
                for (Doctor d : doctors) {
                    System.out.printf("ID: %d | Имя: %s | Средний рейтинг: %.2f%n",
                            d.getId(), d.getName(), d.getAverageRating());
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }

    private static void printDoctors(List<Doctor> doctors, int rating) {
        for (Doctor d : doctors) {
            if (d.getRating() == rating) {
                System.out.println(d);
            }
        }
    }
}