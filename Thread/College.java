import java.util.*;
class Thr implements Runnable{
    Thread t;
    Thr(String name){
        t=new Thread(this,name);
        t.start(); 
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                System.out.println(t.getName());
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }
    }
}
public class College {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter the college name : ");
        name=sc.next();
        new Thr(name);
    }
}