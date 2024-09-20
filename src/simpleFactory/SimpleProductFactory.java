package simpleFactory;

import products.*;

class SimpleProductFactory {
    Product createProduct(ProductTypes type) {
        switch (type) {
            case Candy -> {
                return new Candy();
            }
            case Cake -> {
                return new Cake();
            }
            case Milk -> {
                return new Milk();
            }
            case Juice -> {
                return new Juice();
            }
            case Bread -> {
                return new Bread();
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
            case Chips -> {
                return new Chips();
            }
            case Cigarettes -> {
                return new Cigarettes();
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
                throw new RuntimeException("Продукта типа " + type + " не сущетсвует в базе");
            }
        }
    }
}
