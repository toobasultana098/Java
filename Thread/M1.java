class Th implements Runnable{
    Thread t;
    Th(String name){
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                System.out.println(t.getName()+"\t"+i);
                Thread.sleep(500);
            }catch(InterruptedException e){
            }
        }
    }
}
public class M1 {
    public static void main(String[] args){
        new Th("One");
        new Th("Two");
    }
}