//Greater among 2 numbers

import java.util.Scanner;
public class Greater {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 numbers : ");
        a=in.nextInt();
        b=in.nextInt();
        if (a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
