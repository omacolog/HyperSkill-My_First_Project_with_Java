package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Item earnings
        int bubblegumEarnings = 202;
        int toffeeEarnings = 118;
        int iceCreamEarnings = 2250;
        int milkChocolateEarnings = 1680;
        int doughnutEarnings = 1075;
        int pancakeEarnings = 80;

        // Calculate total earnings
        double totalEarnings = bubblegumEarnings + toffeeEarnings + iceCreamEarnings + milkChocolateEarnings + doughnutEarnings + pancakeEarnings;

        // Print the earnings details
        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d%n", bubblegumEarnings);
        System.out.printf("Toffee: $%d%n", toffeeEarnings);
        System.out.printf("Ice cream: $%d%n", iceCreamEarnings);
        System.out.printf("Milk chocolate: $%d%n", milkChocolateEarnings);
        System.out.printf("Doughnut: $%d%n", doughnutEarnings);
        System.out.printf("Pancake: $%d%n", pancakeEarnings);

        // Print the total earnings
        System.out.printf("Income: $%.1f%n", totalEarnings);
        System.out.println("Staff expenses:");
        double staff = Double.parseDouble(scanner.nextLine().replaceAll("> ", ""));
        System.out.println("Other expenses:");
        double other = Double.parseDouble(scanner.nextLine().replaceAll("> ", ""));
        System.out.printf("Net income: $%.1f%n", totalEarnings-(staff +other));


    }
}