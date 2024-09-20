package factoryMethod;

import products.*;

public class DrinkFactory extends AbstractFactory {
    @Override
    public Product createProduct(ProductTypes type) {
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
