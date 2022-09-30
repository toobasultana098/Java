// Eligibility to vote

import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter age : ");
        n = in.nextInt();
        if (n>18){
            System.out.println("Eligible to vote..");
        }
        else{
            System.out.println("Not eligible to vote..");
        }
    }
}
