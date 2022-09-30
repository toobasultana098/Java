import java.util.Scanner;

class Flight{
    int fn;
    String d;
    float dis,f=1;
    public void Feed_info(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter FlightNumber : ");
        fn = in.nextInt();
        System.out.println("Enter Destination : ");
        d = in.next();
        System.out.println("Enter Distance : ");
        dis= in.nextFloat();
    }
    void CalFuel(){
        if(dis<=1000){
            f=500;
        }
        else if(dis>1000 && dis<=2000){
            f=1100;
        }
        else{
            f=2200;
        }
    }
    void show(){
        System.out.println("FlightNumber : "+fn);
        System.out.println("Destination : "+d);
        System.out.println("Distance : "+dis);
        System.out.println("Fuel : "+f);
    }
}

public class Example3 {
    
    public static void main(String[] args){
        Flight ob =new Flight();
        ob.Feed_info();
        ob.CalFuel();
        ob.show();
    }
}
