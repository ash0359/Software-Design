//Name: Ashammeet Gill #3147996
import java.util.ArrayList;
/**
 * @author(Ron)
 */
public class And implements Expression
{
    Expression left;
    Expression right;
    public And(Expression left, Expression right)
    {
        this.left=left;
        this.right=right;
    }

    
    public boolean evaluate(ArrayList<String> context)
    {
        return this.left.evaluate(context) && this.right.evaluate(context);
    }
}
