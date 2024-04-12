public abstract class Decorator implements Item
{
    Item item;

    public abstract double getPrice();
    public abstract String getName();
}
