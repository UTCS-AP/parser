package data;

abstract class BinOp implements Expression {
    final Expression left, right;

    BinOp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}