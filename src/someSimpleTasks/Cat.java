package someSimpleTasks;

public class Cat extends Animal implements IAnimal {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Cat " + this.name + ": Woof, woof!!!");
    }
    @Override
    public void move() {
        System.out.println("Cat " + this.name + " is moving");
    }
}
