interface Printer{
    String print();
}

class LaserPrinter implements Printer{
    public String print(){
        return ("Laser Printer Printing");
    }
}

public class E2 {
    public static void main(String args[]){
        LaserPrinter l1 = new LaserPrinter();
        String x= l1.print();
        System.out.println(x);
    }
}
