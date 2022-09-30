import java.util.*;
public class Division {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("After division : "+(a/b));
        }catch(ArithmeticException e)
        {
            System.out.println("Divided by zero is not possible..");
        }
        catch(InputMismatchException e){
            System.out.println("Enter numeric values only..");
        }
    }
}