package com.example;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            switch (args[0]) {
                case "-t1":
                    Task1.run();
                    break;
                case "-t2":
                    Task2.run(scanner);
                    break;
                case "-t3":
                    Task3.run();
                    break;
                case "-t4":
                    Task4.run(scanner);
                    break;
                case "-t5":
                    Task5.run();
                    break;
                default:
                    System.out.println("Unknown task");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
        }
    }
}