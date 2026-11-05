package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Transportable.printTransportInfo();

                Transportable[] transports = {
                    new Truck("Джотаро-Траuck", 5000, "2026-01-15"),
                    new Truck("Рохан-Экспресс", 8000, "2026-02-20"),
                    new Truck("Окуясу-Карго", 3000, "2026-03-10"),
                    new Ship("Гнидкинс-Флот", 20000, 1500.5),
                    new Ship("Рыцарь-Лайнер", 35000, 2800.0)
                };

                for (Transportable t : transports) {
                    t.transport("статуя Святого");
                    System.out.printf("   вместимость: %d кг%n", t.getCapacity());

                    if (t instanceof Maintainable) {
                        Maintainable m = (Maintainable) t;
                        m.maintain();
                        System.out.println("   сервис: " + m.getServiceDate());
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