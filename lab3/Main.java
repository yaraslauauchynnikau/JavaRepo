package lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %-15s%n", "Фамилия", "Зарплата");
        for (Employee e : employees) {
            String surname = e.fullname.split(" ")[0];
            System.out.printf("%-15s %10.2f%n", surname, e.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }

        Scanner in = new Scanner(System.in);

        switch (args[0]) {
            case "-t1": {
                System.out.print("First string: ");
                String s1 = in.nextLine();
                System.out.print("Second string: ");
                String s2 = in.nextLine();
                System.out.println(s1 + " " + s2);
                break;
            }

            case "-t2": {
                System.out.print("Sentence: ");
                String sentence = in.nextLine();
                String[] words = sentence.split("\\s+");
                StringBuilder result = new StringBuilder();

                for (String word : words) {
                    if (word.length() >= 3) {
                        if (result.length() > 0) {
                            result.append(" ");
                        }
                        result.append(word);
                    }
                }

                System.out.println(result);
                break;
            }

            case "-t3": {
                Employee[] employees = {
                    new Employee("Овчинников Ярослав Игоревич", 1234.5),
                    new Employee("Зубенко Виктор Корнеплод", 98765.43),
                    new Employee("Поноспод Ливой Корнеев", 5000.0)
                };

                Report.generateReport(employees);
                break;
            }

            case "-t4": {
                String text = "a1a a2a a3a a4a a5a aba a7a a8a a9a";
                Pattern pattern = Pattern.compile("a[1-5]a");
                Matcher matcher = pattern.matcher(text);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }

                break;
            }

            default: {
                System.out.println("Unknown task");
            }
        }

        in.close();
    }
}