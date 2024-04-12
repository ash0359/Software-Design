//Name: Ashammeet Gill #3147996
public class Complaint implements Handler{

    private Handler chain;
    
    public void setNext(Handler next) {
        this.chain=next;
    }

    public void handleRequest(String mail) {
        if(mail == "complaint" || mail == "Complaint"){
            System.out.println("The complaint email is being sent to the legal department");
            
        }
        else{
            this.chain.handleRequest(mail);
        }
    }

}
