class ThreadDemo{
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("Demo");
        t.setPriority(10);
        System.out.println(t);
        for(int i=1;i<=10;i++){
            try{
            System.out.println(t.getName()+"\t"+i);
            Thread.sleep(1000);
            }catch(InterruptedException e)
            {}
        }
    }
}