package discountsystem;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Christian Kyle Ching
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date) {
        Customer customer = new Customer(name);
        Scanner input = new Scanner(System.in);
        
        String ansMember, memberType;
        boolean member;
        
        
        System.out.println("Member? (Y/N):");           ansMember = input.nextLine();
        member = ansMember.equalsIgnoreCase("y");

        if (member == true) {
            System.out.println("Enter membership type: (P - Premium / G - Gold / S - Silver)");
            memberType = input.nextLine();
            switch (memberType) {
                case "p":
                    memberType = "Premium";
                    break;
                case "g":
                    memberType = "Gold";
                    break;
                case "s":
                    memberType = "Silver";
                    break;
            }
        } else {
            memberType = "N/A";
        }
        
        customer.setMember(member);
        customer.setMemberType(memberType);
        
        
        this.date = date;
        this.customer = customer;
    }
    
    public String getName() {
        return customer.getName();
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }
    
    public double getProductExpense() {
        return productExpense;
    }
    
    public void setProductExpense(double ex) {
        productExpense = ex;
    }
    
    public double getTotalExpense() {
        double totalExpense = serviceExpense + productExpense;
        return totalExpense;
    }
    
    
    @Override
    public String toString() {
        DiscountRate discountRate = new DiscountRate();
        double dServiceExpense = 0;
        double dProductExpense = 0;
        
        switch (customer.getMemberType()) {
            case "Premium":
                dServiceExpense = this.serviceExpense - 
                                  (this.serviceExpense * discountRate.getServiceDiscountRate(customer.getMemberType()));
                dProductExpense = this.productExpense - 
                                  (this.productExpense * discountRate.getProductDiscountRate(customer.getMemberType()));
                break;
            case "Gold":
                dServiceExpense = this.serviceExpense - 
                                  (this.serviceExpense * discountRate.getServiceDiscountRate(customer.getMemberType()));
                dProductExpense = this.productExpense - 
                                  (this.productExpense * discountRate.getProductDiscountRate(customer.getMemberType()));
                break;
            case "Silver":
                dServiceExpense = this.serviceExpense - 
                                  (this.serviceExpense * discountRate.getServiceDiscountRate(customer.getMemberType()));
                dProductExpense = this.productExpense - 
                                  (this.productExpense * discountRate.getProductDiscountRate(customer.getMemberType()));
                break;
            default:
                dServiceExpense = this.serviceExpense;
                dProductExpense = this.productExpense;
        }
        
        double totalExpense = dServiceExpense + dProductExpense;
        String visitInfo = "********************\n" 
                         + customer.toString() + "\n\n"
                         + "Service Expense\t\t\t$" + this.serviceExpense + "\n"
                         + "Discounted Service Expense\t$" + dServiceExpense + "\n"
                         + "Product Expense\t\t\t$" + this.productExpense + "\n"
                         + "Discounted Product Expense\t$" + dProductExpense + "\n"
                         + "Total Bill\t$" + totalExpense + "\n"
                         + "********************";
        return visitInfo;
    }
    
}
