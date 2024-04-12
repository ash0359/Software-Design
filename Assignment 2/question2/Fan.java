//Name: Ashammeet Gill #3147996
public class Fan implements Handler {

    private Handler chain;
    
    public void setNext(Handler next) {
        this.chain=next;
    }

    public void handleRequest(String mail) {
        if(mail == "fan" || mail == "Fan"){
            System.out.println("The fan email is being sent to the CEO");
            
        }
        else{
            this.chain.handleRequest(mail);
        }
    }

}
