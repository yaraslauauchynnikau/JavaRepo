package com.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Laptop laptop = new Laptop("Рохан-Book", 16, 512, 1500.0);
                System.out.println("До скидки:");
                laptop.displayInfo();

                laptop.applyDiscount(15);

                System.out.println("После скидки 15%:");
                laptop.displayInfo();
                break;
            }

            case "-t2": {
                Train[] trains = {
                    new Train("Морио", 101, 120),
                    new Train("Дувр", 202, 45),
                    new Train("Каир", 303, 300),
                    new Train("Венеция", 404, 180),
                    new Train("Осака", 505, 60)
                };

                Train maxTime = trains[0];
                Train minTime = trains[0];

                for (Train t : trains) {
                    if (t.travelTime > maxTime.travelTime) maxTime = t;
                    if (t.travelTime < minTime.travelTime) minTime = t;
                }

                System.out.printf("Дольше всех едет поезд %d до %s — %d мин%n",
                        maxTime.trainNumber, maxTime.destination, maxTime.travelTime);
                System.out.printf("Быстрее всех едет поезд %d до %s — %d мин%n",
                        minTime.trainNumber, minTime.destination, minTime.travelTime);

                System.out.println(maxTime);
                break;
            }

            case "-t3": {
                Employee[] employees = {
                    new Employee("Джотаро", Department.IT),
                    new Employee("Рохан", Department.MARKETING),
                    new Employee("Окуясу", Department.IT),
                    new Employee("Коитчи", Department.HR),
                    new Employee("Гнидкинс", Department.SALES),
                    new Employee("Рыцарь", Department.IT)
                };

                System.out.println("Сотрудники отдела IT:");
                for (Employee e : employees) {
                    if (e.department == Department.IT) {
                        System.out.println(e.name);
                    }
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}