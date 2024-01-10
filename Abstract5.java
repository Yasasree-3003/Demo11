abstract class Bank
{
abstract int getRateOfInterest();
}
class SBI extends Bank
{
int getRateOfInterest()
{
return 7;
}
}
class PNB extends Bank
{
int getRateOfInterest()
{
return 8;
}
}
class Union extends Bank
{
int getRateOfInterest()
{
return 6;
}
}
class Indian extends Bank
{
int getRateOfInterest()
{
return 9;
}
}
class Gramina extends Bank
{
int getRateOfInterest()
{
return 4;
}
}
class HDFC extends Bank
{
int getRateOfInterest()
{
return 10;
}
}
class Axis extends Bank
{
int getRateOfInterest()
{
return 11;
}
}
class TestBank
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new Union();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new Indian();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new Gramina();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new HDFC();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new Axis();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
}
}