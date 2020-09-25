package discountsystem;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Christian Kyle Ching
 */
public class DiscountSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Beauty Saloon - Billing System");
        
        String menu = "What would you like to do?\n" +
                      "1. Create new transaction\n" +
                      "2. Exit\n" + 
                      "Type here: ";
        int ans = 1;
        
        String name;
        Date date;
        int month, day, year;
        double serviceEx, productEx;
        
        Visit visit;
        
        
        do {
            System.out.print(menu);
            ans = input.nextInt();
            input.nextLine();
            
            if(ans == 1) {
                
                System.out.println("Enter customer name:");     name = input.nextLine();

                System.out.println("Date:");
                System.out.print("Month (mm): ");               month = input.nextInt();
                System.out.print("Day (dd): ");                 day = input.nextInt();
                System.out.print("Year (yyyy): ");              year = input.nextInt();

                date = new Date(month, day, year);
                visit = new Visit(name, date);

                System.out.print("Enter Service amount: $");    serviceEx = input.nextDouble();
                System.out.print("Enter Product amount: $");    productEx = input.nextDouble();

                visit.setServiceExpense(serviceEx);
                visit.setProductExpense(productEx);

                System.out.println("\n" + visit.toString() + "\n");
                
            }
            
        } while (!(ans == 2));
        
    }
    
}
