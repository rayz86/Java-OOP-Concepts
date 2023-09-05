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
class height extends shape
{
    double length, height;
    protected void arearect()
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

public class multilevel_inheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

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

