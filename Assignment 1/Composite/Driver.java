import java.util.ArrayList;

public class Driver 
{
    public static void main(String[] args)
    {
        Item item1 = new Product("Intro to Python", 22.00);
    

        item1 = new Discount(item1, 10.00);
        item1 = new Reduction(item1, 5.00);

        LineItem item = new LineItem(item1, 2);
        double i1= item1.getPrice()*item.getQuantity();

        Item item2 = new Product("Java Design", 20.00);
        Item item3 = new Product("Java Patterns", 30.00);
        item3 = new Reduction(item3, 5.00);
        
        ArrayList<Item> items = new ArrayList<>();
        items.add(item2);
        items.add(item3);
        Bundle bundle = new Bundle("Best of Java", items);

        System.out.println(bundle.getPrice()+i1);


    }
}
