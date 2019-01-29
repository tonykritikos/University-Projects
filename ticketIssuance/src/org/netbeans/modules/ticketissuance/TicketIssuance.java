/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.ticketissuance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tony
 */
public class TicketIssuance {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("For ticket Issuance-Purchase press 1, for Renewal press 2 and for ticket Information press 3.");
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));
        String first_menu_value = scanIn.readLine();

        if ("1".equals(first_menu_value)) {
            purchase.type();
        } else if ("2".equals(first_menu_value)) {
            Renewal.refresh();
        } else if ("3".equals(first_menu_value)) {
            information.data();
        } else {
            System.out.println("Wrong command.");
        }
    }
}
