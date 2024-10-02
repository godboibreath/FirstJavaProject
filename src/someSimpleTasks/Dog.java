package someSimpleTasks;

public class Dog extends Animal implements IAnimal {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Dog " + this.name + ": Woof, woof!!!");
    }
    @Override
    public void move() {
        System.out.println("Dog " + this.name + " is moving");
    }
}
