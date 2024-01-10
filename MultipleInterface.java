interface Printable
{
void print();
}
interface Showable
{
void show();
}
class A implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
}
class Test9
{
public static void main(String args[])
{
A ob=new A();
ob.print();
ob
.show();
}
}
