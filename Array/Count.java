// Display the count of Positive, Negative and zeroes..


import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[],i,n,p=0,neg=0,z=0;
        System.out.println("Enter the size:");
        n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]>0){
                p++;
            }
            else if(a[i]==0){
                z++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive : "+ p+" Negative : "+neg+" Zeroes : "+z);
    }
}
