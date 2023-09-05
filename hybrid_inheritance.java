import java.util.Scanner;
class shape
{
    String type;
    double area;
    protected void print()
    {
        System.out.println("The area of "+type+" is="+area);
    }
}
class rectangle extends shape
{
    double length, breadth;
    protected void arearect()
    {
        area=length*breadth;
    }
}
class triangle extends shape
{
    double length,height;
    protected void areatri()
    {
        area=0.5*length*height;
    }
}

class equitri extends triangle
{
    protected void areaequitri(double length)
    {
        area=3*length;
    }
}

public class hybrid_inheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //rectangle
        System.out.println("Enter the length of rectangle:");
        double lenrect=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle:");
        double brerect=sc.nextDouble();
        rectangle r=new rectangle();
        r.type="rectangle";
        r.length=lenrect;
        r.breadth=brerect;
        r.arearect();
        r.print();

        //triangle
        System.out.println("Enter the length of triangle:");
        double lentri=sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        double heitri=sc.nextDouble();
        triangle t=new triangle();
        t.type="triangle";
        t.length=lentri;
        t.height=heitri;
        t.areatri();
        t.print();

        //equitri
        equitri e=new equitri();
        e.type="Equilateral triangle";
        e.areaequitri(t.length);
        e.print();
    }
}

