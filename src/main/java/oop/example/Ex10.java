
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex10 {
    public static final double tax = 0.055;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double price1 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        double quantity1 = scanner.nextDouble();
        System.out.println("Enter the price of item 2: ");
        double price2 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        double quantity2 = scanner.nextDouble();
        System.out.println("Enter the price of item 3: ");
        double price3 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 3: ");
        double quantity3 = scanner.nextDouble();

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double addTax = subtotal * tax;
        double total = subtotal + addTax;


        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + addTax);
        System.out.println("Total: $" + total);
    }
}