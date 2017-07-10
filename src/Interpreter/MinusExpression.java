package Interpreter;

/**
 * Created by Zver on 10.07.2017.
 */
public class MinusExpression implements Expression {
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
