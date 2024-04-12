//Name: Ashammeet Gill #3147996
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/**
 * @author(Ron)
 */
public class Driver
{
    public static void main(String args[]) throws IOException {

        ArrayList<Student> context = getContext(); // get student info
        
        LinkedHashMap<String, Expression> asts = getASTs(); // create ASTs

        // for each student evaluate each AST
        System.out.println("Student\t\tCourses eligible for");
        for (int i=0; i<context.size(); i++){
            System.out.println(context.get(i).getName());
            // for each course evaluate the AST for this student
            for (HashMap.Entry<String, Expression> ast : asts.entrySet()){
                if (ast.getValue().evaluate(context.get(i).getCourses())){
                System.out.println("\t\t" + ast.getKey());
                }
            }
        }
    }
    public static ArrayList<Student> getContext() throws FileNotFoundException{
        ArrayList<Student> context = new ArrayList<>();
        // obtain the student info from Context.txt
        Scanner kb = new Scanner(new File ("Context.txt"));
        while (kb.hasNext()) {
            ArrayList<String> ar=new ArrayList<>();
            Scanner line=new Scanner(kb.nextLine());
            String name = line.next();
            while (line.hasNext()) {
                ar.add(line.next());
            }
            context.add(new Student(name, ar));
        }
        return context;
}
public static LinkedHashMap<String, Expression> getASTs(){
    // create ASTs
        LinkedHashMap<String, Expression> map = new LinkedHashMap<>();
        map.put("ACS-1904", new Course("ACS-1903")
            );
        map.put("ACS-2906", new Or(new Course("ACS-1904"), new Course("ACS-1905"))
            );
        map.put("ACS-3801", 
                new And(
                    new Or(
                        new Course("ACS-2816"),
                        new Course("ACS-2916")
                    ),
                    new And(
                        new Course("ACS-2913"), 
                        new And(
                            new Course("ACS-2909"), 
                            new Or(
                                new Course("ACS-2814"),
                                new Course("ACS-2914")
                                )
                            )
                        )
                    )
            );
        map.put("ACS-3921",new And(new Course("ACS-2906"), new Course("ACS-2947")) );

        map.put("ACS- 4954",new And(new Course("ACS-2906"), new And(
            new Course("ACS-3911"), new Course("MATH-1401"))));

        map.put("ACS-4904",
        new And(
        new And(
            new Or(
                new Course("ACS-2913"), 
                new And(
                    new Course("ACS-2911"),
                     new Course("ACS-2912"))
                     ) 
        , new Course ("ACS-2947")
        )
        , new Course("ACS-3902"))
        );
        
        map.put("BIOL-4471",new And(
            new Or(
                new Course("GEOG-2203"),
                new Or(new Course("BIOL-2403"), new Course("BIOL-3471"))
            ),
            new Or(new Course("STAT-1301"),
                new Or(new Course("STAT-1501"), 
                    new Or(new Course("GEOG-2309"),
                        new Or(new Course("GEOG-2310"), new Course("BIOL-3492"))
            )  
            )
            ) 
            )
            );
        return(map);
    }
}
