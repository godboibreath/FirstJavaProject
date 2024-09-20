package factoryMethod;

import products.Product;
import products.ProductTypes;

public abstract class AbstractFactory {
    public Product createProduct(ProductTypes type) {
        throw new RuntimeException("Абстрактная факбрика не может создавать продукты");
    };
}
