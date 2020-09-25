package discountsystem;

/**
 *
 * @author Admin
 */
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    } 
    
    public boolean isMember() {
        return member;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String getMemberType() {
        return memberType;
    }
    
    public void setMemberType(String type) {
        memberType = type;
    }
    
    @Override
    public String toString() {
        String customerInfo = "Customer: " + this.name + "\n"
                            + "Member: " + this.member + "\n"
                            + "Member Type: " + this.memberType;
        return customerInfo;
    }

}
