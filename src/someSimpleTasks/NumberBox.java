package someSimpleTasks;

public class NumberBox<N extends Number> {
    private N number;

    public NumberBox(N number) {
        this.number = number;
    }

    public N getNumber() {
        return number;
    }
}
