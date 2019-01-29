
package org.netbeans.modules.ticketissuance;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Tony
 */
public class information {
    public static void data() throws InterruptedException{
        System.out.println("Connecting to the Database for information.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Surname: Kritikos");
        System.out.println("Name: Antonios");
        System.out.println("Address: Galatsi");
        System.out.println("email: it21330@hua.gr");
        System.out.println("Discount type: Student");
        System.out.println("Tickets left 8");
        
    }
    
}
