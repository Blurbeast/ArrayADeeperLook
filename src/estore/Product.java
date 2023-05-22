package estore;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private Category productCategory;

    public Product(int productId, String productName, String productDescription, Category productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public int getProductId() {return productId;}
    public void setProductId(int productId) {this.productId = productId;}
    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}
    public String getProductDescription() {return productDescription;}
    public void setProductDescription(String productDescription) {this.productDescription = productDescription;}
    public Category getProductCategory() {return productCategory;}
    public void setProductCategory(Category productCategory) {this.productCategory = productCategory;}

    @Override
    public String toString() {
        return ("Product[" +
                "productId=" + productId +
                ", productName='" + productName + "\n" +
                ", productDescription='" + productDescription + "\n" +
                ", productCategory=" + productCategory +
                "]");
    }
}
