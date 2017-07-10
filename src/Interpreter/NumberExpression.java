package Interpreter;

/**
 * Created by Zver on 10.07.2017.
 */
public class NumberExpression implements Expression {
int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
         return number;
    }
}
