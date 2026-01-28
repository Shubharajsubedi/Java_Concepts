package MethodOverloading;

import java.util.Scanner;

public class CalculatorTest {
    static void main(String[] args) {
        Scanner acc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the number to print the sum:" +calc.add(12,12));
        System.out.println("The sum of three numbers is "+calc.add(12,12,12));
        System.out.println("The sum of double is :"+calc.add(12.2,12.2));
    }
}
