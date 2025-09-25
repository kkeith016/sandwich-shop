package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //added scanner
        Scanner scan = new Scanner(System.in);

        // Sandwiches
        double regularprice = 5.45;
        double largeprice = 8.95;
        double loadedregular = 1.00;
        double loadedlarge = 1.75;

        //defining sandwich sizes.
        char regular = 'R';
        char large = 'L';

        //Prompting for what size
        System.out.println("Enter sandwich Size, R for Regular and L for Large");
                char size = scan.next().charAt(0);
        scan.nextLine();

// Ignoring upper or lower case. Ask more for understanding.
        size = Character.toUpperCase(size);

                // Size chosen
        double price =0;
        if (size == 'R'){
            price = regularprice;
            System.out.println("One Regular!");
        }else if (size == 'L'){
            price = largeprice;
            System.out.println("One Large!");
        }else {
            System.out.println("Sorry Regular or Large.");
        }

        // Loaded Question
        System.out.println("Would you like your sandwich loaded? Yes or No?");
        String loaded = scan.nextLine().trim().toLowerCase();
        scan.nextLine();

        if (loaded.equals("yes")) {
            if (size == 'R') {
                price += loadedregular;
            } else if (size == 'L') {
                price += loadedlarge;
            }
        }

        //Age prompt
        System.out.println("Whats your age?");
        int age = scan.nextInt();

        // Calculate Discount
        double discount =0;
        if (age <= 17) {
            discount = 0.10;
        }else if (age >= 65) {
            discount = 0.20;
        }
double total = price - (price*discount);

        // displaying results
        System.out.printf("Your total price is $%.2f%n", total);





    }
}
