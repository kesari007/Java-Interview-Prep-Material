package lld.vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;

    }

    Product addProduct(Product newProduct){
        products.add(newProduct);
        return newProduct;
    }

    void despenseProduct(int productId, double amount, int quantity){
      Product product = products.get(productId);
      if(product.getAmount()*quantity > amount){
        System.out.println("Amount not sufficient");
      } else if(product.getQuantity() < quantity) {
          System.out.println("Quantity not available");
      } else {
         System.out.println(products.get(productId).getName() + " dispensed");
      }
    }
}
