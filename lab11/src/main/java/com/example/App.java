package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Device[] devices = {
                    new TV("JotaroVision 4K", 2024, 899.99, 55.0),
                    new TV("RohanScreen OLED", 2023, 1299.0, 65.0),
                    new TV("OkuyasuTV Budget", 2022, 399.5, 43.0),
                    new Fridge("GnidkinsCool 300", 2023, 749.0, 300),
                    new Fridge("KnightFrost XL", 2024, 1099.0, 450)
                };

                System.out.println("=== Переопределение (полиморфные вызовы) ===");
                for (Device d : devices) {
                    d.displayInfo();
                    d.turnOn();
                    System.out.println();
                }

                System.out.println("=== Перегрузка turnOn() ===");
                Device sample = devices[0];
                sample.turnOn();
                sample.turnOn(150);
                sample.turnOn("Эко");

                System.out.println();
                sample.turnOn(220);

                System.out.println();
                System.out.println("=== Уникальные методы ===");
                for (Device d : devices) {
                    if (d instanceof TV) {
                        ((TV) d).changeChannel(5);
                    } else if (d instanceof Fridge) {
                        ((Fridge) d).defrost();
                    }
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}