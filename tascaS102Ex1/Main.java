package tascaS102Ex1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        
        sale.addProduct(new Product("Book", 29.99));
        sale.addProduct(new Product("Pen", 5.99));
        
        try {
            sale.calculateTotal();
            System.out.println("Total price: $" + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println("Caught EmptySaleException: " + e.getMessage());
        }

        List<String> list = new ArrayList<>();
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}