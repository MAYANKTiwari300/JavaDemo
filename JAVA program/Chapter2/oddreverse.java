public class oddreverse
{
    public static void main(String []args)
    {
         for(int i=100;i>=1;i--){
            if(i%2 ==0)
            continue;
            System.out.print(i+"  ");
        }
    }
}