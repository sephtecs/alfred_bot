import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello " + name;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        boolean Alexis = true;

        if(Alexis) {
            System.out.println("Right away, sir. She certainly isn't sophisticated enough for that.");
        } else if {
            System.out.println("At your service. As you wish, naturally.");
        } else {
            System.out.println("Right. And with that I shall retire.");
        }

        return conversation;
    }
    
}

