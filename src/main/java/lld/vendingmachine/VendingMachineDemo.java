package lld.vendingmachine;

import java.util.Arrays;
import java.util.List;

public class VendingMachineDemo {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> productList = Arrays.asList(new Product(1, "CHIPS", 10.0, 5),
                                            new Product(2,"CHOCOLATE", 15.0, 6),
                                            new Product(3, "COFFEE", 25.0, 5));

        vendingMachine.setProducts(productList);
        vendingMachine.despenseProduct(2, 25.0, 1);

    }
}
