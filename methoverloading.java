//java code to demomstrate method overloading(POLYMORPHISM IN JAVA)
//Author: Rayyan Shaikh
class student
{
    int rno;
    String name;

    public void print()
    {
        System.out.println("student roll no:"+rno);
        System.out.println("student name:"+name);
    }
    public void print(String name, int rno)
    {
        System.out.println("student roll no:"+rno);
        System.out.println("student name:"+name);
    }
    public void print(int rno)
    {
        System.out.println("student roll no:"+rno);
        System.out.println("student name:"+name);
    }

    student()
    {
        name="John Cena";
        rno=54;
    }
}

public class methoverloading
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.print();
        s1.name="Rick Astley";
        s1.rno=420;
        s1.print(s1.name, s1.rno);
        s1.rno=69;
        s1.print(s1.rno);
    }
}