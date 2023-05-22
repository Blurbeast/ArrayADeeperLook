package estore;

public class Items {
    private int selectedQuantity;
    private Product selectedProduct;

    public int getSelectedQuantity() {return selectedQuantity;}
    public void setSelectedQuantity(int selectedQuantity) {this.selectedQuantity = selectedQuantity;}
    public Product getSelectedProduct() {return selectedProduct;}
    public void pickSelectedProduct(Product selectedProduct) {this.selectedProduct = selectedProduct;}
}
