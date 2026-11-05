package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void run(Scanner scanner) throws IOException {
        File file = new File("f_task2.txt");

        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextInt());
            }
        }

        System.out.println("\nЧисла из файла:");
        int powerOfTwoCount = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 0 && (num & (num - 1)) == 0) {
                    powerOfTwoCount++;
                }
            }
        }
        System.out.println("\nКоличество чисел, являющихся степенями двойки: " + powerOfTwoCount);
    }
}