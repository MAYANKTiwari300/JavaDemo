import java.util.Scanner;
public class InputSum
{
    public static void main(String []args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("enter the number:");
         int n=scan.nextInt();
         int sum=0;
         for(int i=1;i<=n;i++)
         {
            sum+=i;
             
         }
          System.out.println("sum 0f natural numbers upto "+n +" is = "+sum);
        scan.close();
    }
}