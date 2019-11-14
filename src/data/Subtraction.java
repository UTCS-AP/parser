package data;

public class Subtraction extends Addition {

    public Subtraction(Expression left, Expression right) {
        super(left, new Negation(right));
    }
}