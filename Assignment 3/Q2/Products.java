//Name: Ashammeet Gill Id:3147996
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Products extends DataAccessor
    {
        private List<String> products;
        public  void Connect()
        {
            products = new ArrayList<>();
        }
        public void Select()
        {
            products.add("Car");
            products.add("Bike");
            products.add("Boat");
            products.add("Truck");
            products.add("Moped");
            products.add("Rollerskate");
            products.add("Stroller");
        }
        public void Process(int top)
        {
            System.out.println("Products ---- ");
            for (int i = 0; i < top; i++)
            {
                System.out.println(products.get(i));
            }
            System.out.println();
        }
        public void Disconnect()
        {
            products.clear();
        }
    }