interface Bank
{
float rateOfInterest();
}
class SBI implements Bank
{
public float rateOfInterest()
{
return 7.5f;
}
}
class PNB implements Bank
{
public float rateOfInterest()
{
return 8.8f;
}
}
class Test8
{
public static void main(String args[])
{
Bank b=new SBI();
System.out.println("ROI:"+b.rateOfInterest());
Bank a=new PNB();
System.out.println("ROI:"+a.rateOfInterest());
}
}
