import java.util.*;
class Floyds
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                
                j++;
        }
        System.out.println();
        i++;
   }
}
}           