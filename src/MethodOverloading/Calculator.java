package MethodOverloading;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    int c;


    int add (int a, int b){
        return a+b;
    }

    int add (int a , int b, int c){
        return a+b+c;
    }

    double add (double a, double b){
        return a +b;
    }
}

