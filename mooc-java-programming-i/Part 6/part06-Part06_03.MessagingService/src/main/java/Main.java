
public class Main {

    public static void main(String[] args) {

        Message x = new Message("me", "hey bae whats up");
        MessagingService y = new MessagingService();
        y.add(x);
        System.out.println(y.getMessages());
    }
}
