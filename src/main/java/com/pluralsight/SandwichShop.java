package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //added scanner
        Scanner scan = new Scanner(System.in);

        // Sandwiches
        double regularprice = 5.45;
        double largeprice = 8.95;

        //defining sandwich sizes.
        char regular = 'R';
        char large = 'L';

        //Prompting for what size
        System.out.println("Enter sandwich Size, R for Regular and L for Large");
                char size = scan.next().charAt(0);

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
        //Age prompt
        System.out.println("Whats your age");
        int age = scan.nextInt();






    }
}
