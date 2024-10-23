import java.awt.desktop.*;
package exceptions;

class NonEligibleException extends Exception {
    public NonEligibleException(String message) {
        super(message);
    }
}
class Account{
    String account_no = null;
    double balance = 0;
    Account(String account_no, double balance){
        this.account_no=account_no;
        this.balance = balance;
    }
    void deposit(double amount){
        this.balance+=amount;
        System.out.println("Previous balance for account: " +this.account_no+ " was: "+this.balance);
        System.out.println("Amount: "+ amount+" deposited to account no: "+ this.account_no);
        System.out.println("Current balance for account: " +this.account_no+ " was: "+this.balance);
    }
    void  withdraw(double amount){
        System.out.println("Previous balance for account: " +this.account_no+ " was: "+this.balance);
        if(this.balance>amount){
            this.balance-=amount;
            System.out.println("Amount: "+ amount+" withdrawed from account no: "+ this.account_no);
        }else{
            System.out.println("Unable to withdraw amount due to insufficient balance");
        }
        System.out.println("Current balance for account: " +this.account_no+ " was: "+this.balance);
    }
}

class Transaction extends Thread{
    Account acc;
    double amount = 0 ;
    String type = null;
    Transaction(Account acc, double amount, String type){
        this.acc = acc;
        this.amount=amount;
        this.type=type;
    }
    public void run(){
        if(type.equals("deposit")){
            acc.deposit(this.amount);
        }else if(type.equals("withdraw")){
            acc.withdraw(amount);
        }else{
            System.out.println("Please enter a valid transaction type.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Simulation Started");
        Account ac1 = new Account("AC1", 5000);
        Account ac2 = new Account("AC2", 0);
        Account ac3 = new Account( "AC3",10000 );
        Transaction t1 = new Transaction(ac1 , 400, "withdraw");
        Transaction t2 = new Transaction(ac2, 1000, "deposit");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}