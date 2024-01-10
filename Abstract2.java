abstract class Myclass
{
public void disp1()
{
System.out.println("Concrete method parent class");
}
abstract public void disp2();
}
class Demo extends Myclass
{
public void disp2()
{
System.out.println("overriding abstract method");
}
}
class Test1
{
public static void main(String args[])
{
Myclass m=new Demo();
m.disp1();
m.disp2();
}
}

