
public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:


        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        System.out.println(b); // looks for the toString() method in Book class.
        String x = b.getAuthor(); // puts author in string x
        System.out.println(x); // prints string x

    }
}
