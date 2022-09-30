import java.util.Scanner;

interface Loan{
    double issueLoan();
}

interface Insurance{
    double takeInsurance ();
}

class Vehicle implements Loan, Insurance{
    private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;
    Vehicle(String vehicleNumber,String modelName,String vehicleType,double price){
        this.vehicleNumber=vehicleNumber;
        this.modelName=modelName;
        this.vehicleType=vehicleType;
        this.price=price;
    }
    public double issueLoan(){
        double lamount=0.0;
        if(vehicleType.compareTo("1Wheeler")==0){
            lamount=(80*price)/100;
        }
        else if(vehicleType.compareTo("2Wheeler")==0){
            lamount=(75*price)/100;
        }
        else if(vehicleType.compareTo("3Wheeler")==0){
            lamount=(50*price)/100;
        }
        return lamount;
        
    }
    public double takeInsurance(){
        double iamount=0.0;
        if(price<=150000){
            iamount=3500;
        }
        else if(price>150000 && price<=300000){
            iamount=4000;
        }
        else if(price >300000){
            iamount=5000;
        }
        return iamount;
    }
}

public class E3 {
    public static void main(String args[]){
        Vehicle v1 = details();
        double x=v1.issueLoan();
        System.out.println("Loan amount : "+x);
        x=v1.takeInsurance();
        System.out.println("Insurance amount : "+x);
    }
    public static Vehicle details(){
        Scanner sc = new Scanner(System.in);
        String vehicleNumber,modelName,vehicleType;
        double price;
        System.out.println("Enter Vehicle Number : ");
        vehicleNumber=sc.next();
        System.out.println("Enter Model name : ");
        modelName=sc.next();
        System.out.println("Enter Vehicle Type : ");
        vehicleType=sc.next();
        System.out.println("Enter vehicle Price : ");
        price=sc.nextDouble();
        Vehicle v1 = new Vehicle(vehicleNumber,modelName,vehicleType,price);
        return v1;
    } 
}
