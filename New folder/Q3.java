import java.util.*;

public class Q3 {
    public static int spy(int n){
        int sum=0,prod=1;
        while(n>0){
            int x=n%10;
            sum+=x;
            prod*=x;
            n=n/10;
        }
        if(sum==prod){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x,y,a;
        System.out.println("Enter range : ");
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=x;i<=y;i++){
            a=spy(i);
            if(a==1){
                System.out.println(i+" ");
            }
        }
    }
}
