//Name: Ashammeet Gill #3147996
public interface Handler {

    void setNext(Handler nextChain);
    
    void handleRequest(String mail);
}