package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void run() throws IOException {
        File f = new File("f_task3.txt");
        File g = new File("g_task3.txt");
        File h = new File("h_task3.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 15; i++) {
                writer.println(random.nextInt(200) - 100);
            }
        }

        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(new FileWriter(g));
             PrintWriter writerH = new PrintWriter(new FileWriter(h))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int temp = Math.abs(num);
                int sum = 0;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum % 2 == 0) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
        }
        System.out.println("Числа с четной суммой цифр записаны в g_task3.txt");
        System.out.println("Остальные числа записаны в h_task3.txt");
    }
}