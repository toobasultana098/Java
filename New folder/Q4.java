import java.util.*;

public class Q4 {
    public static int prime(int x){
        for(int i=3;i<=x/2;i++){
            if(x%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void gb(int n){
        for(int i=3;i<n;i+=2){
            for(int j=3;j<n;j+=2){
                int u = prime(i);
                int v = prime(j);
                if(u==1|| v==1){
                    if(i+j==n){
                        System.out.println(n+" is a GOLDBATCH No. => "+i+" "+j);
                        break;
                    }
                } 
                break; 
            }
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.println("Enter range : ");
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=x;i<=y;i++){
            gb(i);
        }
    }
}
