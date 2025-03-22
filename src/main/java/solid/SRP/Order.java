package solid.SRP;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Order {

    //having multiple responsibilities - add, remove, calculateTotalPrice
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(int productId){
        products.removeIf(product -> product.getProductId() == productId);
    }

    public Product getProduct(int productId){
        Optional<Product> productToReturn = products.stream().filter(product -> product.getProductId() == productId).findFirst();
        return productToReturn.orElse(null);
    }

    public int calculateTotalPrice(){
        int sum = 0;
        for(Product pr : products){
            sum+=pr.getPrice();
        }
        return sum;
    }

}
