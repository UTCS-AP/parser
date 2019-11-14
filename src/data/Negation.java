package data;

public class Negation implements Expression {
    private final Expression e;

    Negation(Expression e) {
        this.e = e;
    }

    public int evaluate() {
        return - this.e.evaluate();
    }

    public String toString() {
        return "(-" + this.e.toString() + ")";
    }
}