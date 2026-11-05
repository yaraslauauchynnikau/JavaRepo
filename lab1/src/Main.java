package lab1.src;

//import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given");
            return;
        }
        else if (args.length == 1) {
            System.out.println("All tasks require a second argument");
        }

        switch(args[0]) {
            case "-task1" : {
                System.out.println(Math.pow(Double.parseDouble(args[1]), 3.0));
                return;
            }
            case "-task2" : {
                int year = Integer.parseInt(args[1]);
                if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
                    System.out.println("Is leap year");
                } else {
                    System.out.println("Not a leap year");
                }
                return;
            }
            case "-task3" : {
                int n = Integer.parseInt(args[1]);
                double sum = 0;
                for (int i = 1; i < n + 1; i++) {
                    sum += 1.0 / i;
                }
                System.out.println("sum: " + sum);
                return;
            }
            default : {
                System.out.println("Task out of range or wrong task input");
            }
        }
    }
}