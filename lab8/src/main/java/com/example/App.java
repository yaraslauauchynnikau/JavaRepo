package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Tool[] tools = {
                    new Drill("Дрель Джотаро", 800, 2.3, 2800),
                    new Drill("Дрель Рохана", 1200, 3.1, 3200),
                    new Drill("Дрель Окуясу", 650, 1.8, 2400),
                    new Saw("Пила Гнидкинса", 1500, 4.5, 60),
                    new Saw("Пила Рыцаря", 1800, 5.2, 72)
                };

                for (Tool t : tools) {
                    t.displayInfo();
                    t.use();

                    if (t instanceof Drill) {
                        ((Drill) t).changeBit();
                    } else if (t instanceof Saw) {
                        ((Saw) t).sharpen();
                    }

                    System.out.println();
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}