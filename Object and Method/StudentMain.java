import java.util.*;

class Student{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;
    Student(int id,String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=new int[marks.length];
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=marks[i];
        }
    }
    void Calculateavg(){
        int m=0;
        for(int i=0;i<marks.length;i++){
            m+=marks[i];
        }
        average=m/marks.length;
        FindGrade();
    }
    void FindGrade(){
        if (average>=80)
        {
            grade='O';
        }
        else{
            grade='A';
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]<50){
                grade='F';
                break;
            }
        }
    }
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Average : "+average);
        System.out.println("Grade : "+grade);
    }
}

public class StudentMain {
    public static void main(String args[]){
        Student s1 = getStudentDetails();
        s1.Calculateavg();
        s1.show();
    }
    public static Student getStudentDetails(){
        int id,n;
        String name;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter id : ");
        id=in.nextInt();
        System.out.println("Enter name : ");
        name=in.next();
        System.out.println("Enter number of subjects : ");
        n=in.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter mark for subject "+(i+1));
            marks[i]=in.nextInt();
        }
        Student s1=new Student(id,name,marks);
        return s1;
    }
}
