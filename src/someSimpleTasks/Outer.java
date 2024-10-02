package someSimpleTasks;

public class Outer {
    public static class Static {
        private final String name;

        public Static() {
            this.name = "Static class";
        }

        public String getName() {
            return this.name;
        }
    }

    private class Inner {
        private final String name;

        Inner() {
            this.name = "Inner class";
        }

        String getName() {
            return this.name;
        }
    }

    private Inner inner;

    public Outer() {
        this.inner = new Inner();
    }

    public String getInnerName() {
        return this.inner.getName();
    }
}
