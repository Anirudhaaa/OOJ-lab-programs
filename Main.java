import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
Scanner m = new Scanner(System.in);
System.out.print ( "Enter a,b,c of the equation:");
double a=m.nextDouble();
double b=m.nextDouble();
double c=m.nextDouble();
double d=((b*b)-(4*a*c));
double root1 , root2 ;
if (d>=0)
{
root1= (-b - Math.sqrt(d))/(2*a);
root2= (-b + Math.sqrt(d))/(2*a);
System.out.println ("Two real roots are:"+root1+" "+root2);
}
else
{
System.out.println ("No real roots"); 
}
}
}