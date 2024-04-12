//Name: Ashammeet Gill #3147996
import java.util.ArrayList;
/**
 * A student name and the courses taken
 *
 * @author (Ron)
 */
public class Student
{    
    private String name;
    private ArrayList<String> courses;

    /**
     * Constructor for objects of class Context
     */
    public Student(String name, ArrayList<String> courses)
    {
        this.name=name;
        this.courses=courses;
    }

        public String getName(){
            return this.name;
    }
        public ArrayList<String> getCourses(){
            return this.courses;
    }
}
