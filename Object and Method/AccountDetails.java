import java.util.*;

class Account {
    int accountId,balance;
    String accountType;
    Account(int accountId, String accountType, int balance){
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }
    boolean Withdraw(int wd){
        if(balance-wd>1000){
            balance-=wd;
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
    void show(){
        System.out.println("Balance amount after withdraw : "+balance);
    }
}

public class AccountDetails {
    public static void main(String args[]){
        Account a1 = getAccountDetails();
        a1.Withdraw(getWithdrawAmount());
        a1.show();
    }
    public static Account getAccountDetails(){
        int id,b;
        String type;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account id : ");
        id=in.nextInt();
        System.out.println("Enter account type : ");
        type=in.next();
        System.out.println("Enter Balance : ");
        b=in.nextInt();
        while(b<=0){
            System.out.println("Balance should be positive..");
            System.out.println("Enter Balance : ");
            b=in.nextInt();
        }
        Account a1 = new Account(id,type,b);
        return a1;
    }
    public static int getWithdrawAmount(){
        int wd;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn : ");
        wd=in.nextInt();
        while(wd<=0){
            System.out.println("Amount should be positive..");
            System.out.println("Enter amount to be withdrawn : ");
            wd=in.nextInt();
        }
        return wd;
    }
}
