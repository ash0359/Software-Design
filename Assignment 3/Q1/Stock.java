//Name: Ashammeet Gill Id:3147996
import java.util.ArrayList;
import java.util.List;

public abstract class Stock
    {
        private String symbol;
        private double price;
        private List<IInvestor> investors = new ArrayList<>();
        // Constructor
        public Stock(String symbol, double price)
        {
            this.symbol = symbol;
            this.price = price;
        }
        public void Attach(IInvestor investor)
        {
            investors.add(investor);
        }
        public void Detach(IInvestor investor)
        {
            investors.remove(investor);
        }
        public void Notify()
        {
            for(IInvestor investor:investors)
            {
                investor.Update(this);
            }
            System.out.println("");
        }
        // Gets or sets the price
        public double getPrice()
        {
            return price; 
        }

        public void setPrice(double value)
        {
            if (price != value)
                {
                    price = value;
                    Notify();
                }
        }


        // Gets the symbol
        public String getSymbol()
        {
            return symbol;
        }
    }