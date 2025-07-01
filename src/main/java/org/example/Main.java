package org.example;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float celsius = 0.0f;
        Scanner userIn  = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        celsius = Float.parseFloat(userIn.nextLine());
        float fahrenheitOut = ((celsius*(9f/5f))+32);
        String formattedOutput = String.format("%.2f",fahrenheitOut);
        System.out.println("Temperature in Fahrenheit: "+ formattedOutput);
    }
}