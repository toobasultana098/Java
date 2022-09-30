import java.util.*;

class Bank{
    int ano;
    double amount;
    String name;
    char type;
    Bank(){
        name=null;
        amount=0.00;
        ano=0;
        type='\u0000';
    }
    Bank(String name , int acno , double amt,char t){
        this.name=name;
        this.ano=acno;
        this.amount=amt;
        this.type=t;
    }
    void deposit(double d){
        this.amount+=d;
    }
    void withdraw(double wd){
        if(this.amount-wd>1000){
            this.amount-=wd;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Amount : "+amount);
    }
}

public class Example6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        double b,e,wd;
        String c;
        char d;
        System.out.println("Enter name : ");
        c=in.next();
        System.out.println("Enter Account Number : ");
        a=in.nextInt();
        System.out.println("Enter Amount : ");
        b=in.nextDouble();
        System.out.println("Enter Type(S/C) : ");
        d=in.next().charAt(0);
        Bank b1 = new Bank(c,a,b,d);
        System.out.println("Enter deposit amount : ");
        e=in.nextDouble();
        b1.deposit(e);
        System.out.println("Enter Withdrawl Amount : ");
        wd=in.nextDouble();
        b1.withdraw(wd);
        b1.show();
    }
}
