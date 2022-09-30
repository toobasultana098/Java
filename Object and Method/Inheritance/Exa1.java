import java.util.Scanner;

class A{
    int a;
    A(int a)
    {
        this.a=a;
    }
}

class B extends A{
    int b;
    B(int a, int b){
        super(a);
        this.b=b;
    }
    void sum(){
        System.out.println("Sum = "+(a+b));
    }
}

public class Exa1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        B ob = new B(a,b);
        ob.sum();
    }
}
