// Sum of all odd numbers from 1 to n

import java.util.Scanner;
public class Odd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n= in.nextInt();
        for (int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
            
        }
    }
    
}
