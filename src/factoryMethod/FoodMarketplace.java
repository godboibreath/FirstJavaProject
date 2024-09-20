package factoryMethod;

public class FoodMarketplace extends AbstractMarketplace{
    public FoodMarketplace() {
        this.factory = new FoodFactory();
    }
}
