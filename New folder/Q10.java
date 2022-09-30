import java.util.*;

public class Q10 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String type;
        int d,c=0,dr=0,a=0;
        System.out.println("Enter the car type(Maruti(M) or Sumo(S)) : ");
        type=sc.next();
        System.out.println("Enter Distance : ");
        d=sc.nextInt();
        if(type.compareTo("M")==0){
            if(d<=100){
                c=800;
                dr=100;
            }
            else if(d>=100 && d<=200){
                int x=d-100;
                c=800+(x*10);
                dr=300;
            }
            else if(d>200){
                c=d*15;
                dr=500;
            }
        }
        else if(type.compareTo("S")==0){
            if(d<=100){
                c=600;
                dr=100;
            }
            else if(d>=100 && d<=200){
                int x=d-100;
                c=600+(x*8);
                dr=300;
            }
            else if(d>200){
                c=d*12;
                dr=500;
            }
        }
        a=c+dr;
        System.out.println("Total Anount = "+a);

    }
}
