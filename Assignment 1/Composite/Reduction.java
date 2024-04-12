public class Reduction extends Decorator
{
    double reducedBy;

    public Reduction(Item item, double reducedBy)
    {
        this.item = item;
        this.reducedBy = reducedBy;
    }

    public double getPrice()
    {
        return this.item.getPrice() - this.reducedBy;
    }

    public String getName()
    {
        return this.item.getName();
    }
}