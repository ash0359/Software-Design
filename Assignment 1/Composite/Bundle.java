import java.util.ArrayList;

public class Bundle implements Item
{
    String name;
    ArrayList<Item> items = new ArrayList<>();

    public Bundle(String name, ArrayList<Item> items)
    {
        this.name = name;
        this.items = items;
    }

    @Override
    public double getPrice() 
    {
        double total = 0;

        for(int i =0; i < this.items.size();i++)
        {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    @Override
    public String getName() {
        return this.name;
    }
}