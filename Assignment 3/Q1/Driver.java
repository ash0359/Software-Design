//Name: Ashammeet Gill Id:3147996
public class Driver
{
    public static void main(String[] args)
        {
            // Create IBM stock and attach investors
            IBM ibm = new IBM("IBM", 120.00);
            ibm.Attach(new Investor("Sorros"));
            ibm.Attach(new Investor("Berkshire"));
            // Fluctuating prices will notify investors
            ibm.setPrice(120.10);
            ibm.setPrice(121.00);
            ibm.setPrice(120.50);
            ibm.setPrice(120.75);
        }
    }