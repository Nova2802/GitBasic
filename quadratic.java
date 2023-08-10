import java.io.*;
class quadratic;
{
public ststic void main(String args[])
{
int a,b,c,z;
float r1,r2;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
z=b*b-4*a*c;
if(z==0)
{
System.out.println("equation is quadratic and roots are real and equal");
r1=-b+Math.sqrt(z)/2*a;
r2=-b-Math.sqrt(z)/2*a;
System.out.println("root1="+r1);
System.out.println("root2="+r2);
}
else
if(z>0)
{
System.out.println("Roots are real and distinct");
r1=-b+Math.sqrt(z)/2*a;
r2=-b-Math.sqrt(z)/2*a;
System.out.println("root1="+r1);
System.out.println("root2="+r2);
}
else
{
System.out.println("Roots are imaginary");
}
}
}