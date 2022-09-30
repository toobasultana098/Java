import java.util.*;

class Bus{
    int bno,dis,fare;
    String from,to;
    char type;
    Bus(){
        type = 'O';
        fare =500;
    }
    void CalcFare(){
        if(type=='O'){
            fare=15*dis;
        }
        else if(type=='E'){
            fare=20*dis;
        }
        else if(type=='L'){
            fare=24*dis;
        }
    }
    void Allocate(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter bus no. : ");
        bno=in.nextInt();
        System.out.println("Enter From : ");
        from=in.next();
        System.out.println("Enter to : ");
        to=in.next();
        System.out.println("Enter type : ");
        type=in.next().charAt(0);
        System.out.println("Enter Distance : ");
        dis=in.nextInt();
        CalcFare();
    }
    void Show(){
        System.out.println("Bus no. : "+bno);
        System.out.println("From : "+from);
        System.out.println("To : "+to);
        System.out.println("Bus Type : "+type);
        System.out.println("Distance : "+dis);
        System.out.println("Fare : "+fare);
    }
}

public class Example7 {
    public static void main(String args[]){
        Bus b1 = new Bus();
        b1.Allocate();
        b1.Show();
    }
}
