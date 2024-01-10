import java.util.Scanner;
class CharAtExample2
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String str=s1.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
if(i%2==0)
{
System.out.println("Char at"+" "+i+" "+"place"+" "+str.charAt(i));
}
}
}
}