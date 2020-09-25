package discountsystem;

/**
 *
 * @author Christian Kyle Ching
 */
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.2;
    private static double productDiscountGold = 0.15;
    private static double productDiscountSilver = 0.1;
    
    public double getServiceDiscountRate(String type) {
        
        double discountRate = 0;
        switch (type) {
            case "Premium":
                discountRate = serviceDiscountPremium;
            case "Gold":
                discountRate = serviceDiscountGold;
            case "Silver":
                discountRate = serviceDiscountSilver;
        }
        return discountRate; 
    }
    
    
    public double getProductDiscountRate(String type) {
        
        double discountRate = 0;
        switch (type) {
            case "Premium":
                discountRate = productDiscountPremium;
            case "Gold":
                discountRate = productDiscountGold;
            case "Silver":
                discountRate = productDiscountSilver;
        }
        return discountRate;
        
    }
    
}
