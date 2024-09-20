package simpleFactory;

import products.Product;
import products.ProductTypes;

import java.util.Scanner;

public class FactoryCode {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String productType = scanner.nextLine();
        Marketplace marketplace = new Marketplace(new OnlyDrinkProductFactory());
        Product orderedProduct = marketplace.orderProduct(ProductTypes.valueOf(productType));
    }
}
