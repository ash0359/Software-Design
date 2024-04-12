//Name: Ashammeet Gill #3147996
public class NewLoc implements Handler {

    private Handler chain;
    
    public void setNext(Handler next) {
        this.chain=next;
    }

    public void handleRequest(String mail) {
        if(mail == "newLoc" || mail == "NewLoc"){
            System.out.println("The NewLoc email is being sent to business development");
            
        }else{
            this.chain.handleRequest(mail);
        }
        
    }

}
