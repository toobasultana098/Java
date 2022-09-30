import java.util.*;
class Invalid extends Exception{
    Invalid(String msg){
        super(msg);
    }
}
public class Voting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        try{
            System.out.println("Enter age : ");
            a=sc.nextInt();
            if(a<0)
            throw new Invalid("Invalid age..");
            if(a>=18){
                System.out.println("Eligible for vote.");
            }
            else{
                System.out.println("Not Eligible for vote.");
            }
        }catch(Invalid e) {   
            System.out.println(e.getMessage());
        }
    }
}