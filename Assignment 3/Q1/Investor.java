//Name: Ashammeet Gill Id:3147996
public class Investor implements IInvestor
    {
        private String name;
        private Stock stock;
        // Constructor
        public Investor(String name)
        {
            this.name = name;
        }
        public void Update(Stock stock)
        {
            System.out.println("Notified {0} of {1}'s " +
                "change to {2:C} "+ name+" "+ stock.getSymbol()+ " "+stock.getPrice());
        }
        // Gets or sets the stock
        public Stock getStock()
        {
            return stock; 
        }

        public void setStock(Stock s)
        {
            this.stock = s;
        }

    }
