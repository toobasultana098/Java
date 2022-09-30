import java.util.Scanner;

class Student{
    private int studentId;
    private String studentName, studentAddress, collegeName;
    Student(){
        
    }
    Student(int studentId, String studentName, String studentAddress, String collegeName){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id : ");
        studentId=sc.nextInt();
        System.out.println("Enter Student's Name : ");
        studentName=sc.next();
        System.out.println("Enter Student's address : ");
        studentAddress=sc.next();
    }
    void check(){
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Whether the student is from NIT(Yes/No) : ");
        x=sc.next();
        if(x.compareTo("Yes")==0){
            collegeName="NIT";
        }
        else if(x.compareTo("No")==0){
            System.out.println("Enter the college Name : ");
            collegeName=sc.next();
        }
        else{
            System.out.println("Wrong Input");
            check();
        }
    }
    void show(){
        System.out.println("Student id : "+studentId);
        System.out.println("Student name : "+studentName);
        System.out.println("Address : "+studentAddress);
        System.out.println("College name : "+collegeName);
    }
}

public class College {
    public static void main(String args[]){
        Student s1= new Student();
        s1.input();
        s1.check();
        s1.show();
    }
}
