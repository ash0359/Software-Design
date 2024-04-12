//Name: Ashammeet Gill Id:3147996
public class Driver
    {
        public static void main(String[] args)
        {
            DataAccessor categories = new Categories();
            categories.Run(5);
            DataAccessor products = new Products();
            products.Run(3);
        }
    }