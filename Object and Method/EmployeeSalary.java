import java.util.Scanner;

class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    Employee(int employeeId, String employeeName, double salary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }
    public void calculateNetSalary(int pfpercentage){
        netSalary = salary - (salary*pfpercentage/100);
    }
    void show(){
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Salary : "+salary);
        System.out.println("Net Salary : "+netSalary);
    }
}

public class EmployeeSalary {
    public static void main(String args[]){
        Employee e1 = getEmployeeDetails();
        e1.calculateNetSalary(getPFPercentage());
        
        e1.show();
    }
    public static Employee getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        int employeeId;
        String employeeName;
        double salary;
        System.out.println("Enter Employee Id : ");
        employeeId=sc.nextInt();
        System.out.println("Enter Name : ");
        employeeName=sc.next();
        System.out.println("Enter Salary : ");
        salary=sc.nextDouble();
        Employee e1= new Employee(employeeId,employeeName,salary);
        return e1;
    }
    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        int pfpercentage;
        System.out.println("Enter Pf percentage : ");
        pfpercentage=sc.nextInt();
        return pfpercentage;
    }
}
