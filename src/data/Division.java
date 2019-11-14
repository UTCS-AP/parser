package data;

public class Division extends BinOp {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public int evaluate() {
        return this.left.evaluate() / this.right.evaluate();
    }

    public String toString() {
        return "(" + this.left.toString() + " / " + this.right.toString() + ")";
    }
}