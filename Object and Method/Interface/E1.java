interface A{
    int sum(int a, int b);
}

interface B{
    int pro(int a,int b);
}

class C implements A,B{
    public int sum(int a, int b){
        return (a+b);
    }
    public int pro(int a, int b){
        return (a*b);
    }
}

public class E1 {
    public static void main(String args[]){
        C ob = new C();
        int x= ob.sum(10,20);
        System.out.println("Sum = "+x);
        x= ob.pro(10,20);
        System.out.println("Product = "+x);
        A ob1 = new C();
        x=ob1.sum(2,5);
        System.out.println("Sum = "+x);
        B ob2 = new C();
        x= ob2.pro(2,5);
        System.out.println("Product = "+x);
    }
}
