package Clases;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Lenovo", "H50/50", 5000, 1);
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
