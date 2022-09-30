import java.util.Scanner;

class Emp{
    int eid;
    String name;
    double basic;
    Emp(int eid, String name, double basic){
        this.eid=eid;
        this.name=name;
        this.basic=basic;
    }
}

class DA extends Emp{
    double da;
    DA(int eid, String name, double basic) {
        super(eid, name, basic);
    }
    void calc(){
        da = (40.00*basic)/100.00; 
    }
}

class HRA extends DA{
    double hra;
    HRA(int eid, String name, double basic) {
        super(eid, name, basic);
    }    
    void calc(){
        super.calc();
        hra=(20.00*basic)/100.00;
    }
}

class GS extends HRA{
    double gs;
    GS(int eid, String name, double basic) {
        super(eid, name, basic);
    }
    void calc(){
        super.calc();
        gs=basic+da+hra;
    }
    void show(){
        System.out.println("EID = "+eid);
        System.out.println("Name = "+name);
        System.out.println("GS = "+gs);
    }
}


public class Exa2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int eid;
        String name;
        double basic;
        System.out.println("Enter EID : ");
        eid=sc.nextInt();
        System.out.println("Enter Name : ");
        name=sc.next();
        System.out.println("Enter Basic : ");
        basic=sc.nextDouble();
        GS ob= new GS(eid,name,basic);
        ob.calc();
        ob.show();
    }
}