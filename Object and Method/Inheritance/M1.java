abstract class shape{
    double x;
    shape(double x)
    {
        this.x=x;
    }
    abstract void area();
}

class square extends shape{
    square(double s)
    {
        super(s);
    }
    void area()
    {
        System.out.println("Area of a square="+(x*x)); 
    }
}

class circle extends shape{
    circle(double r)
    {
        super(r);
    }
    void area()
    {
        System.out.println("Area of a circle="+Math.PI*x*x);
    }
}

public class M1 {
    public static void main(String[] args) {
        square s1=new square(3.5);
        s1.area();
        circle c1=new circle(5.6);
        c1.area();
    }
}