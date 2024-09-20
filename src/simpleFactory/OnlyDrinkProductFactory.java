package simpleFactory;

import products.Juice;
import products.Milk;
import products.Product;
import products.ProductTypes;
import products.Lemonade;
import products.Vodka;
import products.Beer;
import products.Whiskey;
import products.Tea;
import products.Coffee;
import products.Watter;

class OnlyDrinkProductFactory extends SimpleProductFactory {
    @Override
    Product createProduct(ProductTypes type) {
        switch (type) {
            case Milk -> {
                return new Milk();
            }
            case Juice -> {
                return new Juice();
            }
            case Lemonade -> {
                return new Lemonade();
            }
            case Vodka -> {
                return new Vodka();
            }
            case Beer -> {
                return new Beer();
            }
            case Whiskey -> {
                return new Whiskey();
            }
            case Tea -> {
                return new Tea();
            }
            case Coffee -> {
                return new Coffee();
            }
            case Watter -> {
                return new Watter();
            }
            default -> {
                throw new RuntimeException("Продукта типа " + type + " для фабрики напитков не существует");
            }
        }
    }
}
