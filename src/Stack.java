import data.Expression;

class Stack {
    static final private int DEFAULT_SIZE = 10;

    final private int size;

    private int topIdx = 0;

    private Expression[] list;

    Stack(int size) {
        if (0 <= size)
            this.size = size;
        else
            this.size = Stack.DEFAULT_SIZE;
        this.list = new Expression[this.size];
    }

    boolean push(Expression e) {
        if (this.topIdx < this.size) {
            this.list[topIdx] = e;
            this.topIdx++;
            return true;
        } else
            return false;
    }

    Expression pop() {
        if (0 < this.topIdx)
            return this.list[--this.topIdx];
        else
            return null;
    }
}
