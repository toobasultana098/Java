class Student{
    String name;
    int roll,marks;
    Student(){

    }
    Student(int roll, String name,int marks){
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
       return roll+"\t"+name+"\t"+marks;
    }
}


public class Example5 {
    public static void main(String args[]){
        Student S1[]= new Student[3];
        S1[0]=new Student(1,"a",20);
        S1[1]=new Student(2,"b",50);
        S1[2]=new Student(3,"c",70);
        for(int i=0;i<3;i++){
            System.out.println(S1[i]);
        }
    }
}
