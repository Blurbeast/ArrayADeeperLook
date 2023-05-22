package estore;

public class Customer {
    private Billing billing;
    private ShoppingCart shoppingCart;
    public Billing getBilling() {return billing;}
    public void setBilling(Billing billing) {this.billing = billing;}
    public ShoppingCart getShoppingCart() {return shoppingCart;}
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
