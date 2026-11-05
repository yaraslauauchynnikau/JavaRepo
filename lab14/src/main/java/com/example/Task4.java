package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
    public static void run(Scanner scanner) throws IOException {
        File file = new File("f_task4.txt");

        System.out.println("Введите 10 вещественных значений углов (в градусах):");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextDouble());
            }
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        }
        System.out.printf("Средний угол: %.2f градусов%n", (sum / count));
    }
}