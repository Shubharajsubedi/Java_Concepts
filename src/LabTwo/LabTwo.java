import jdk.jfr.Description;

import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//            feet(sc);
//         exercise1(sc);
        // exercise2(sc);
//         exercise3(sc);
        // exercise4(sc);
        // exercise5(sc);
        // exercise6(sc);
//        exercise7(sc);
//         exercise9(sc);
//         exercise10();
         exercise11(sc);
        // exercise12(sc);

        sc.close();
    }


    public static void feet(Scanner sc){
        System.out.println("Enter the length in feet: ");
        double feet = sc.nextDouble();
        double meter = feet * 0.3714;
        System.out.printf("%.2f feet = %.2f meter%n",feet,meter);
    }

    // 1. Fahrenheit to Celsius
    public static void exercise1(Scanner sc) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);
    }

    // 2. Cylinder volume
    public static void exercise2(Scanner sc) {
        System.out.print("Enter the radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the length of cylinder: ");
        double length = sc.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("Area = %.4f%n", area);
        System.out.printf("Volume = %.4f%n", volume);
    }

    // 3. Sum of digits (0 - 1000)
    public static void exercise3(Scanner sc) {
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = sc.nextInt();
        int sum = 0;

        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits in " + number + " is " + sum);
    }

    // 4. Uppercase to lowercase
    public static void exercise4(Scanner sc) {
        System.out.print("Enter an uppercase letter: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            char lower = (char)(ch + 32);
            System.out.println("Lowercase: " + lower);
        } else {
            System.out.println("Not a valid uppercase letter");
        }
    }

    // 5. ASCII code to character
    public static void exercise5(Scanner sc) {
        System.out.print("Enter an ASCII code (0-127): ");
        int code = sc.nextInt();
        if (code >= 0 && code <= 127) {
            char character = (char) code;
            System.out.println("The character for ASCII " + code + " is '" + character + "'");
        } else {
            System.out.println("Invalid ASCII code");
        }
    }

    // 6. Number of days in a month
    public static void exercise6(Scanner sc) {
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days;
        switch (month) {
            case 1: days = 31; break;  // Jan
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days = 29;  // leap year
                else
                    days = 28;
                break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println("Number of days: " + days);
    }

    // 7. Grade based on marks
    public static void exercise7(Scanner sc) {
        System.out.print("Enter assignment marks (0-100): ");
        int marks = sc.nextInt();

        String grade;
        String description;

        if (marks >= 80 && marks <= 100) {
            grade = "A+";
            description = "Distinction";
        }
        else if (marks >= 75) {
            grade = "A";
            description = "Distinction";
        }
        else if (marks >= 70) {
            grade = "B+";
            description = "Distinction";
        }
        else if (marks >= 65) {
            grade = "B";
            description = "Credit";
        }
        else if (marks >= 55) {
            grade = "C";
            description = "Credit";
        }
        else if (marks >= 50) {
            grade = "D";
            description = "Pass";
        }
        else if (marks >= 41) {
            grade = "F+";
            description = "Marginal Fail";
        }
        else if (marks >= 0) {
            grade = "F";
            description = "Fail";
        }
        else {
            System.out.println("Invalid marks");
            return;
        }

        System.out.println("Grade: " + grade);
        System.out.println("Description: " + description);
    }

    // 9. Sum of double array using enhanced for loop
    public static void exercise9(Scanner sc) {
        double[] values = new double[100];
        System.out.println("Enter 100 double values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double val : values) {  // Enhanced for loop
            sum += val;
        }
        System.out.println("Sum of all values = " + sum);
    }

    // 10. Tuition fee after 10 years (5% annual increase)
    public static void exercise10() {
        double tuition = 10000.0;
        double rate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;  // or tuition *= 1.05;
        }
        System.out.printf("Tuition fee in 10 years:: RM%.2f%n", tuition);
    }

    // 11. Do-while loop to continue or exit
    public static void exercise11(Scanner sc) {
        String choice;
        do {
            System.out.println("=== Program is running ===");
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = sc.next().toLowerCase();
        } while (choice.equals("yes") || choice.equals("y"));

        System.out.println("Program terminated.");
    }

    // 12. Future investment value
    public static void exercise12(Scanner sc) {
        System.out.print("Enter investment amount: RM");
        double amount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = amount * Math.pow(1 + annualRate / 100, years);

        System.out.printf("Future investment value = RM%.2f%n", futureValue);
    }
}