package someSimpleTasks;

public class Box<T> {
    private T contain;

    public Box(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return this.contain;
    }
}
