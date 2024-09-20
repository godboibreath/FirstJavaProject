package simpleFactory;

import products.ProductTypes;
import products.Product;

class Marketplace {

    SimpleProductFactory productFactory;

    Marketplace(SimpleProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    Product orderProduct(ProductTypes type) {
        Product product = this.productFactory.createProduct(type);
        product.create();
        product.sell();
        System.out.println("Продукт " + type + " отправлен на заказ");
        return product;
    }
}
