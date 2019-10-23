import java.util.ArrayList;
/*Melyssa Navarro
1071553
 */
public class ArrayListBankAccount {


    public static void main(String[] args){
        //create ArrayList to hold BankAccount objects

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();

        BankAccount anotherBankAccount = new BankAccount(200.0);

        //add 3 BankAccount objects to the ArrayList

        list.add(new BankAccount(100.0));
        list.add(new BankAccount(500.0));
        list.add(new BankAccount(1500.0));
        list.add(anotherBankAccount);

        //display each item
        for(int index=0; index <list.size(); index++ ) {

            BankAccount account = list.get(index);
            System.out.println("Account at index " + index + "\nBalance: " + account.getBalance());
        }
//in class assignment
        //use bank account constructor with string
        list.add(new BankAccount("2187"));
        //withdraw $50 from list[3]
        list.get(3).withdraw(50);
        //deposit $5000 into list[1]
        list.get(1).deposit(5000);
        //change balance for list[0] to $10500
        list.get(0).setBalance(10500);

        //displaying each new item

        System.out.println("                      Account changes as follow:           ");
        for(int index=0; index <list.size(); index++ ) {

            BankAccount account = list.get(index);
            System.out.println("Account at index " + index + "\nBalance: " + account.getBalance());
        }


        // print sum of all accounts in list to screen
        double sum=0;

        for(int index=0; index <list.size(); index++ ) {
            BankAccount account = list.get(index);
            sum += account.getBalance();
        }

        System.out.println("Account sum: " + sum);


        // print average of all accounts
        double average;
        average = sum / list.size();
        System.out.println("Account average " + average);
    }





}
