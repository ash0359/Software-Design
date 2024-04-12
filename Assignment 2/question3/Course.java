//Name: Ashammeet Gill #3147996
import java.util.ArrayList;

/**
 * @author(Ron)
 */
public class Course implements Expression
{
    String course;
    public Course(String course)
    {
        this.course=course;
    }

    
    public boolean evaluate(ArrayList<String> context)
    {
        if ( context.contains(this.course) ) return true;
        else return false;
    }
}
