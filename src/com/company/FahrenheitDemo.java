package com.company;

import java.util.Scanner;

public class FahrenheitDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Current Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.print("Current Fahrenheit: "+fahrenheit);
    }
}
