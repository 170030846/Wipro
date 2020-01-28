import java.util.*;
class Fact
{
public static void main(String args[0])
{
int n = Integer.parseInt(args[0]);
int i=1;
long factorial=1;
if(args.length == 0)
{
System.out.println("Please enter an integer");
}
else
{
do
{
factorial = factorial * i;
i++;
}
while(i<=n);
{
System.out.println("the factorial of " + n + " is " + factorial);
}
}
}
} 