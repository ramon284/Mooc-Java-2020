import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageList;
    
    public MessagingService(){
        messageList = new ArrayList<Message>();
    }
    
    public void add(Message message){
        String x = message.getContent();
        if(x.length() > 280 ){
            return;
        }
        messageList.add(message);
    }
    
    public ArrayList<Message> getMessages(){
        if(messageList == null){
            
        }
        return this.messageList;
    }
}
