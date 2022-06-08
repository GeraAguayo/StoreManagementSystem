package Package;

public class Product {
    String productName;
    double productPrice;

    public void addProduct(String nameProduct,double priceProduct){
        Product p = new Product();
        p.productName = nameProduct;
        p.productPrice = priceProduct;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
