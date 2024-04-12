//Name: Ashammeet Gill #3147996
public class Spam implements Handler {

    private Handler chain;
    
    public void setNext(Handler next) {
        this.chain=next;
    }

    public void handleRequest(String mail) {
        if(mail == "spam" || mail == "Spam"){
            System.out.println("The spam email is being deleted");
            
        }
        else{
            this.chain.handleRequest(mail);
        }
    }

}
