import java.util.*;
class NoMatchException extends Exception{
    NoMatchException(String msg){
        super(msg);
    }
}
public class Name {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Enter a country name : ");
        x=sc.next();
        try{
            if(x.compareTo("India")==0){
                System.out.println("India..");
            }
            else
            throw new NoMatchException("Wrong Input..");
        }catch(NoMatchException e){
            System.out.println(e.getMessage());
        }
    }
}
