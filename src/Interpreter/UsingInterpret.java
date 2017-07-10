package Interpreter;

/**
 * Created by Zver on 10.07.2017.
 */
public class UsingInterpret {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1+2+3");
        System.out.println(expression.interpret());
    }
}
