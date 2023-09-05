//if final keyword is given for class, the class cannot be inherited
class confidential
{
    public final void auth()
    {
        System.out.println("AUTHOR IS : RAYYAN");
    }
}

class intruder extends confidential
{
    //if auth() is created again, it will throw an error
    // public void auth()
    // {
    //     System.out.println("AUTHOR IS : ELON");
    // }
}


public class final_constraints
{
    public static void main(String args[])
    {
        intruder i=new intruder();
        i.auth();

        final int num=9;
        //num=69;
        System.out.println("NUM="+num);
    }

}
