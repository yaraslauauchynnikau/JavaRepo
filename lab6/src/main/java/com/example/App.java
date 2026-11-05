package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Rectangle[] rectangles = {
                    new Rectangle(3, 4),
                    new Rectangle(5.5, 2.5),
                    new Rectangle(10, 10),
                    new Rectangle(1.2, 7.8)
                };

                for (Rectangle r : rectangles) {
                    r.displayInfo();
                }

                Rectangle box = new Rectangle(2, 2);
                System.out.println();
                System.out.println("Меняем стороны через сеттеры...");
                box.setWidth(6);
                box.setHeight(9);
                box.displayInfo();

                System.out.println();
                System.out.println("Пробуем задать отрицательную ширину...");
                box.setWidth(-3);
                box.displayInfo();
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}