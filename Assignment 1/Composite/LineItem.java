public class LineItem
{
    Item item;
    int quantity;

    public LineItem(Item item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return this.item.getPrice();
    }

    public String getName()
    {
        return this.item.getName();
    }

    public int getQuantity()
    {
        return this.quantity;
    }
}