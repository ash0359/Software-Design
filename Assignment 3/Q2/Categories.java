//Name: Ashammeet Gill Id:3147996
import java.util.ArrayList;
import java.util.List;

public class Categories extends DataAccessor
    {
        private List<String> categories;
        public void Connect()
        {
            categories  = new ArrayList<String>();
        }
        public void Select()
        {
            categories.add("Red");
            categories.add("Green");
            categories.add("Blue");
            categories.add("Yellow");
            categories.add("Purple");
            categories.add("White");
            categories.add("Black");
        }
        public void Process(int top)
        {
            System.out.println("Categories ---- ");
            for(int i = 0; i < top; i++)
            {
                System.out.println(categories.get(i));
            }
            
            System.out.println();
        }
        public  void Disconnect()
        {
            categories.clear();
        }
    }