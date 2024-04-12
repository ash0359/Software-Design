//Name: Ashammeet Gill #3147996
import java.util.Scanner;

public class emailDriver {

    public static void main(String[] args) {

        Handler c1 = new Fan();
        Handler c2 = new Complaint();
        Handler c3 = new NewLoc();
        Handler c4 = new Spam();

        // set the chain of responsibility
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);

        c1.handleRequest("Spam");
        c1.handleRequest("Fan");
        c1.handleRequest("Complaint");
        c1.handleRequest("NewLoc");
    }
}