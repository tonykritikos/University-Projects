
package org.netbeans.modules.ticketissuance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tony
 */
public class Renewal {

    /**
     *
     * @throws InterruptedException
     */
    public static void refresh() throws InterruptedException, IOException {
        System.out.println("For regular ticket press 1, for Discount press 2.");
        BufferedReader scanIn = new BufferedReader(new InputStreamReader(System.in));

        String second_menu_value;
        second_menu_value = scanIn.readLine();

        if ("1".equals(second_menu_value)) {
            purchase.amount(1);
        } else if ("2".equals(second_menu_value)) {
            purchase.info();
            purchase.amount(2);
        } else {
            System.out.println("Wrong command.");
        }
    }

}
