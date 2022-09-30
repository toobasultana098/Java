class A{                                        //Method
    int a,b;                                    //instance variable
    void init(int x,int y){                     //local variable
        a=x;
        b=y;
    }
    void show(){
        System.out.println("a = "+a+" b = "+b);
    }
}   


public class Example1 {
    public static void main(String[] args){
        A ob = new A();                            //Object declaration
        ob.init(10,20);
        ob.show();
    }
}
