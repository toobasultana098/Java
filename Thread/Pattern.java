class X{
    synchronized void print(char ch){
        try{
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch+" ");
                    Thread.sleep(200);
                }
                System.out.println();
            }
        }catch(InterruptedException e){
        }
    }
}
class T implements Runnable{
    Thread t;
    X p;
    char ch;
    T(X p, char ch){
        this.p=p;
        this.ch=ch;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        p.print(ch);
    }
}
public class Pattern{
    public static void main(String args[]){
        X p= new X();
        new T(p,'*');
        new T(p,'?');
    }
}