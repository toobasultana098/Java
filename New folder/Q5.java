import java.util.*;

public class Q5 {
    public static void primef(int n){
        int flag = 0;
        for(int i = 2; i< n/2; i++) {
            if(n%i==0){
                if(i==2 || i==3 || i==5){
                    flag = 0;
                } 
                else{
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Ugly number");
        }
        else{
            System.out.println("Not Ugly Number");
        }
    }  
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        primef(n);
    }  
}
