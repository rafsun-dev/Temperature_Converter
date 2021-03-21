package com.company;

import java.util.Scanner;

public class CelsiusDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Current Fahrenheit: ");
        int fahrenheit = input.nextInt();
        double celsius = .56 * (fahrenheit - 32);
        System.out.println("Current Celsius: "+celsius);
    }
}
