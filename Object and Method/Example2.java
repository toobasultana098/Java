//Calculate Simple Interest...

import java.util.Scanner;

class B{
    int a,b;
    float c,si;
    void init(int p, float r, int t){
        a=p;
        c=r;
        b=t;
    }
    void calc(){
        si=(a*b*c)/100;
    }
    void show(){
        System.out.println("SImple Interset = "+si);
    }
}


public class Example2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        B ob = new B();
        int m,n;
        float l;
        System.out.println("Enter Principle, Rate And Time : ");
        m=in.nextInt();
        l=in.nextFloat();
        n=in.nextInt();
        ob.init(m,l,n);
        ob.calc();
        ob.show();
    }
}
