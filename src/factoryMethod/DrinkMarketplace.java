package factoryMethod;

public class DrinkMarketplace extends AbstractMarketplace{
    public DrinkMarketplace() {
        this.factory = new DrinkFactory();
    }
}
