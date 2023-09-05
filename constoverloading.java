//java code to demomstrate constructor overloading
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

    student()
    {
        name="John Cena";
        rno=54;
    }

    student(String name, int rno)
    {
        this.name=name;
        this.rno=rno;
    }

    student(student s)
    {
        this.name=s.name;
        this.rno=s.rno;
    }
}

public class constoverloading
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.print();
        student s2=new student("Rick Astley",69);
        s2.print();
        student s3=new student(s2);
        s3.print();
    }
}