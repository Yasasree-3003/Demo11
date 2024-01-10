abstract class Bike
{
abstract void run();
}
class Honda extends Bike
{
public void run()
{
System.out.println("running safely");
}
}
class Test2
{
public static void main(String args[])
{
Bike a=new Honda();
a.run();
}
}