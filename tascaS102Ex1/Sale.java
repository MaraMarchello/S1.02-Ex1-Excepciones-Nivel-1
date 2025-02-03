package tascaS102Ex1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws SaleBuidedException {
        if (products.isEmpty()) {
            throw new SaleBuidedException("To make a sale you must first add products");
        }
        
        totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void main(String[] args) {
        Sale sale = new Sale();
        
        
        try {
            sale.calculateTotal();
        } catch (SaleBuidedException e) {
            System.out.println("Exception message: " + e.getMessage());
        }

        
        sale.addProduct(new Product("Product 1", 10.0));
        sale.addProduct(new Product("Product 2", 20.0));

        
        try {
            sale.calculateTotal();
            System.out.println("Total price: " + sale.totalPrice);
        } catch (SaleBuidedException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            List<String> list = new ArrayList<>();
            
            String element = list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
