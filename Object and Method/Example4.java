import java.util.Scanner;

class TestMatch{
    int tc,noc,cr;
    String d;
	void CalculateCntr(){
		cr=(noc/100)-1;
	}
	void GetData(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Test Code : ");
		tc=in.nextInt();
		System.out.println("Enter Description : ");
		d=in.next();
		System.out.println("Enter No. of Candidates : ");
		noc=in.nextInt();
	}
	void PutData(){
		System.out.println("____________________TEST MATCH INFORMATION____________________");
		System.out.println("Test Match Code : "+tc);
		System.out.println("Description : "+d);
		System.out.println("Total Candidates : "+noc);
		System.out.println("Centers Required : "+cr);
	}
}

public class Example4 {
    public static void main(String[] args){
		TestMatch ob = new TestMatch();
		ob.GetData();
		ob.CalculateCntr();
		ob.PutData();
	}
}