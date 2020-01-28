import java.util.*;
class p_2_2
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
if(n.length == 0)
{
System.out.println("Please enter an integer number");
}
else if(n==1 || n==0)
{
System.out.println(n + " is neither prime nor composite");
}
else if(n==2 || n==3 )
{
System.out.println(n + " is prime number ");
}
else
{
int flag =0;
for(int i=2;i<(n/2)+1;i++)
{
if(n%i==0)
{
flag = 1;
break;
}
}
if(flag==1)
{
System.out.println(n + "is not a prime");
}
else
{
System.out.println(n + "is a prime);
}
}
}
}
