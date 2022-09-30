import java.util.*;
import java.lang.String;

class Clothing{
    String TROUSER;
    String code,type,material;
    int size;
    double price;
    Clothing(){
        
        code="NOT ASSIGNED";
        type="NOT ASSIGNED";
        material="NOT ASSIGNED";
        size=0;
        price=0;
    }
    void CalcPrice(){
        if(type.compareTo("TROUSER")==0){
            if(material.compareTo("COTTON")==0){
                price=1500.0;
            }
            else{
                price=1500.0-(1500.0*25.0/100.0);
            }
        }
        if(type.compareTo("SHIRT")==0){
            if(material.compareTo("COTTON")==0){
                price=1200.0;
            }
            else{
                price=1200.0-(1200.0*25.0/100.0);
            }
        }
    }
    
    void Enter(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter code : ");
        code=in.next();
        System.out.println("Enter type : ");
        type=in.next();
        System.out.println("Enter Material : ");
        material=in.next();
        System.out.println("Enter size : ");
        size=in.nextInt();
        CalcPrice();
    }
    void show(){
        System.out.println("Code : "+code);
        System.out.println("Type : "+type);
        System.out.println("Material : "+material);
        System.out.println("Size : "+size);
        System.out.println("Price : "+price);
    }
}

public class Example8 {
    public static void main(String args[]){
        Clothing c1=new Clothing();
        c1.Enter();
        c1.show();
    }
}
