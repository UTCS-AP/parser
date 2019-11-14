package data;

public class Numeric implements Expression {
    private final int value;

    public Numeric(int value) {
        this.value = value;
    }

    public int evaluate() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}