
package org.netbeans.modules.ticketissuance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Tony
 */
public class purchase {

    public static void type() throws InterruptedException, IOException {
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("For regular ticket press 1, for Discount press 2.");
        String second_menu_value = scanIn.readLine();
        if ("1".equals(second_menu_value)) {
            purchase.amount(1);
        } else if ("2".equals(second_menu_value)) {
            purchase.info();
            purchase.amount(2);
        } else {
            System.out.println("Wrong command.");
        }
    }

    public static void amount(int type) throws InterruptedException, IOException {
        System.out.println("For one-way tickets press 1, for card-type tickets press 2.");
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        String third_menu_value = scanIn.readLine();

        if ("1".equals(third_menu_value)) {
            System.out.println("How many tickets would you like?");
            Scanner scan = new Scanner(System.in);
            int tickets = scan.nextInt();
            double cost = (tickets*(1.40 / type));
            purchase.payment(cost);
        } else if ("2".equals(third_menu_value)) {
            System.out.println("For 7-day card press 1, for monthly card press 2.");
            String fourth_menu_value = scanIn.readLine();
            if ("1".equals(fourth_menu_value)) {
                double cost = 9.8 / type;
                purchase.payment(cost);
            } else if ("2".equals(fourth_menu_value)) {
                double cost = 30 / type;
                purchase.payment(cost);
            } else {
                System.out.println("Wrong command.");
            }
        } else {
            System.out.println("Wrong command.");
        }

    }

    private static void payment(double cost) throws InterruptedException, IOException {
        System.out.println("For cash payment press 1, for card payment press 2.");
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        String fourth_menu_value = scanIn.readLine();

        if ("1".equals(fourth_menu_value)) {
            System.out.println("Insert " + cost +".");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Money inserted, collect your receipt.");
            purchase.issuance();
        } else if ("2".equals(fourth_menu_value)) {
            System.out.println("The cost is " + cost +", please insert your card");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Type your pin number.");
            TimeUnit.SECONDS.sleep(1);
            String pin = scanIn.readLine();
            System.out.println("Pin number correct");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Transaction complete, collect your receipt.");
            purchase.issuance();
        } else {
            System.out.println("Wrong command.");
        }

    }

    static void info() throws IOException {
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name.");
        String name = scanIn.readLine();
        System.out.println("Enter your surname.");
        String surname = scanIn.readLine();
        System.out.println("Enter your address.");
        String address = scanIn.readLine();
    }

    private static void issuance() throws IOException {
        System.out.println("For e-ticket press 1, for printed ticket press 2.");
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        String ticket = scanIn.readLine();
        if ("1".equals(ticket)) {
            System.out.println("Give email address to send the ticket.");
            String email_address = scanIn.readLine();
        } else if ("2".equals(ticket)) {
            System.out.println("Collect your ticket.");
        } else {
            System.out.println("Wrong command.");
        }
    }

}
