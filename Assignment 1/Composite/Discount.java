public class Discount extends Decorator
{
    Double discount;

    public Discount(Item item, Double discount)
    {
        this.item = item;
        this.discount = discount;
    }

    public double getPrice()
    {
        return (Double)this.item.getPrice() * (1-(this.discount/100));
    }

    public String getName()
    {
        return this.item.getName();
    }
}