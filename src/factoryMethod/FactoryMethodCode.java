package factoryMethod;

import products.ProductTypes;

public class FactoryMethodCode {
    public static void main(String[] args) {
        new DrinkMarketplace().orderProduct(ProductTypes.Vodka);
    }
}
