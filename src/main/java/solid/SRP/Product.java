package solid.SRP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    String productName;
    int productId;
    int price;

    Product(String productName, int productId, int price){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }
}

