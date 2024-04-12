import java.util.ArrayList;

public class Invoice
{
    LineItem LineItem;
    ArrayList<LineItem> lineI = new ArrayList<>();

    public Invoice(LineItem LineItem, ArrayList<LineItem> lineI)
    {
        this.LineItem = LineItem;
        this.lineI = lineI;
    }

    public double total()
    {
        double total = 0;
        for(int i=0; i < this.lineI.size();i++)
        {
            total += this.lineI.get(i).getPrice();
        }

        return total;
    }


}
