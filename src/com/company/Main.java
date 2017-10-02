package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validOrder = false;
        int itemOrdered = 0;
        int nuOfOrders = 0;
        while (!validOrder) {
            System.out.println("Would you like to order a \n1.Tractor \n2.Handbag \n3.Shed ");
            itemOrdered = scanner.nextInt();
            if (itemOrdered > 3 || itemOrdered < 1) {
                System.out.println("Please enter a valid input");
            } else {
                validOrder = true;
            }
        }
        String itemName = "";
        switch (itemOrdered) {
            case 1:
                itemName = "Tractor";
                break;
            case 2:
                itemName = "Handbag";
                break;
            case 3:
                itemName = "Shed";
                break;
        }

        boolean validNuOfUsers = false;
        while (! validNuOfUsers) {
            System.out.println("How many people would you like to order a " + itemName + " for?");
            nuOfOrders = scanner.nextInt();
            if (nuOfOrders > 5){
                System.out.println("You can not order for more than 5 people");
            } else {
                validNuOfUsers = true;
            }
        }
        Scanner addressScanner = new Scanner(System.in);
        String[] addresses;
        addresses = new String[nuOfOrders];
        for (int i = 0; i < nuOfOrders; i++){
            System.out.println("Please enter address " + (i + 1));
            addresses[i] = addressScanner.nextLine();
        }

        System.out.println();
        System.out.println("Thank you for ordering a " + itemName);
        System.out.println();
        for (int j = 0; j < nuOfOrders; j++) {
            System.out.println(addresses[j]);
        }

    }
}
