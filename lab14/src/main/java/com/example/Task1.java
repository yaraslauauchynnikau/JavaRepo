package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {
    public static void run() throws IOException {
        File file = new File("song.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Название: Bohemian Rhapsody");
            writer.println("Исполнитель: Queen");
            writer.println("Альбом: A Night at the Opera");
            writer.println("Год: 1975");
        }

        System.out.println("=== Информация о файле ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Доступен для чтения: " + file.canRead());

        System.out.println("\n=== Содержимое файла ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}