package factoryMethod;

import products.*;

public class FoodFactory extends AbstractFactory {
    @Override
    public Product createProduct(ProductTypes type) {
        switch (type) {
            case Candy -> {
                return new Candy();
            }
            case Cake -> {
                return new Cake();
            }
            case Bread -> {
                return new Bread();
            }
            case Chips -> {
                return new Chips();
            }
            default -> {
                throw new RuntimeException("Фабрика еды не может создавать тип " + type);
            }
        }
    }
}
