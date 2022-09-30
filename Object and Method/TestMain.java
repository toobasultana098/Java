import java.util.Scanner;
 
class Department{
    private int did;
    private String dname;
    Department(){

    }
    Department(int did, String dname){
        this.did=did;
        this.dname=dname;
    }
    void show(){
        System.out.println("Department id : "+did);
        System.out.println("Department name : "+dname);
    }
}

class Student{
    private int sid;
    private String sname;
    private Department department;
    Student(int sid, String sname, Department department){
        this.sid=sid;
        this.sname=sname;
        this.department=department;
    }
    void show(){
        System.out.println("Student id : "+sid);
        System.out.println("Student name : "+sname);
    }
}

public class TestMain {
    public static void main(String args[]){
        Student s1 = createStudent();
        s1.show();
        Department d1 = new Department();
        d1.show();

    }
    public static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        int sid,did;
        String dname,sname;
        System.out.println("Enter the Department id : ");
        did=sc.nextInt();
        System.out.println("Enter the Department name : ");
        dname=sc.next();
        System.out.println("Enter the Student id : ");
        sid=sc.nextInt();
        System.out.println("Enter the Student name : ");
        sname=sc.next();
        Student s1 = new Student(sid,sname,new Department(did, dname));
        return s1;
    }
}