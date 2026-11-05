package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        switch (args[0]) {
            case "-t1": {
                Building[] buildings = {
                    new ResidentialBuilding("ул. Морио, 1", 9, 4500.0, 120),
                    new ResidentialBuilding("ул. Дувр, 12", 5, 2200.0, 60),
                    new ResidentialBuilding("пр. Каирский, 7", 16, 9800.0, 240),
                    new OfficeBuilding("ул. Венецианская, 3", 12, 7200.0, 25),
                    new OfficeBuilding("ул. Осака, 44", 7, 3800.0, 14)
                };

                for (Building b : buildings) {
                    b.displayInfo();
                    System.out.println();
                }
                break;
            }

            default:
                System.out.println("Unknown task");
        }
    }
}