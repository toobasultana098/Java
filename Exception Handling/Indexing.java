import java.util.*;
public class Indexing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        int a[]={1,2,3};
        int n;
        System.out.println("Enter the index value : ");
        n=sc.nextInt();
        System.out.println("Value : "+a[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong index..");
        }
    }
}
