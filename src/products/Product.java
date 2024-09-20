package products;

public abstract class Product {
    protected ProductTypes type;

    public void create() {
        System.out.println("Создание продукта " + this.type);
    }

    public void sell() {
        System.out.println("Продажа продукта " + this.type);
    }
}
