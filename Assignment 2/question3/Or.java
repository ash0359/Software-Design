//Name: Ashammeet Gill #3147996
import java.util.ArrayList;

/**
 * @author(Ron)
 */
public class Or implements Expression
{
    Expression left;
    Expression right;
    public Or(Expression left, Expression right)
    {
        this.left=left;
        this.right=right;
    }

    public boolean evaluate(ArrayList<String> context)
    {
        return this.left.evaluate(context) || this.right.evaluate(context);
    }
}
