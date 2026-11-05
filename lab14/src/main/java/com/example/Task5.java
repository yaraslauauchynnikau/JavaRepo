package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void run() throws IOException {
        File file = new File("f_task5.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(200) - 100);
            }
        }

        int negativeCount = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() < 0) {
                    negativeCount++;
                }
            }
        }
        System.out.println("Количество чисел меньше 0: " + negativeCount);
    }
}