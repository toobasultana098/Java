class Th extends Thread{
   Th(String name)
   {
        super(name);
        Th t=new Th(name);
        t.start();
   }
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                System.out.println(this.getName()+"\t"+i);
                Thread.sleep(500);
            }catch(InterruptedException e){
            }
        }
    }
}
public class M2 {
    public static void main(String[] args){
        new Th("One");
        new Th("Two");
    }
}
