package chapter2.examples;

import java.util.Scanner;

// Listing 2.4

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;  // Declare a constant

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
