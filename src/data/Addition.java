package data;

public class Addition extends BinOp {

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }

    public String toString() {
        return "(" + this.left.toString() + " + " + this.right.toString() + ")";
    }
}