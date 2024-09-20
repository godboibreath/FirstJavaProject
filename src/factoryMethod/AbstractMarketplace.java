package factoryMethod;

import products.Product;
import products.ProductTypes;

public class AbstractMarketplace {
    protected AbstractFactory factory;
    public Product orderProduct(ProductTypes type) {
        Product product = this.factory.createProduct(type);
        product.create();
        product.sell();
        System.out.println("Продукт " + type + " отправлен на заказ");
        return product;
    }
}
