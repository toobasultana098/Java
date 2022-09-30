import java.util.Scanner;
class Average {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int a,b,c,avg;
        System.out.println("Enter 3 numbers : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        avg = (a+b+c)/2;
        System.out.println("Average = " + avg);
    }
}
