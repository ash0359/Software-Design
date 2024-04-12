public class Product implements Item
{
    String name;
    double price;

    public Product(String n, double p)
    {
        this.name = n;
        this.price = p;
    }

    @Override
    public double getPrice() 
    {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
