abstract class engine
{
    abstract void runs();
    public void drives()
    {
        System.out.println("Engines drives on fuel");
    }
    engine()
    {
        System.out.println("Engine is created");
        
    }
}

class petrol extends engine
{
    public void runs()
    {
        System.out.println("Engine runs on Petrol");
    }
    petrol()
    {
        System.out.println("Petrol Engine is created");
    }
}

class diesel extends engine
{
    public void runs()
    {
        System.out.println("Engine runs on Diesel");
    }
    diesel()
    {
        System.out.println("Diesel Engine is created");
    }
}

public class data_encapsulation
{
    public static void main(String args[])
    {
        petrol p=new petrol();
        p.runs();
        p.drives();

        System.out.println("");

        diesel d=new diesel();
        d.runs();
        d.drives();
    }
}
