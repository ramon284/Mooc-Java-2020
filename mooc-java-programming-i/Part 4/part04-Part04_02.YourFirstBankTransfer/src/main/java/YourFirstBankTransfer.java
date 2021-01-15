
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account myAccount = new Account("Matthews account", 1000.0);
        Account myAccount2 = new Account("My account", 0);
        myAccount.withdrawal(100);
        myAccount2.deposit(100.0);
        System.out.println(myAccount);
        System.out.println(myAccount2);
    }
}
