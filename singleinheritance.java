class shape
{
    String type;
    public void print()
    {
        System.out.println("Shape is a "+type);
    }
}

class triangle extends shape
{
    triangle() //not required
    {
        System.out.println("Default constructor called at init");
    }
}


public class singleinheritance
{
    public static void main(String args[])
    {
        triangle t=new triangle();
        t.type="Triangle";
        t.print();
    }
}
