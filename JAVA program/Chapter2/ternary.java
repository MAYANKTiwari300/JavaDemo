class ternary
{
    public static void main(String []args)
    {
       int a=10,b=15,c=20;

       String result1=(b>a)?"b is greater than a":"a is greater than b";

       System.out.println(result1);
     // program to print greatest between three number
    //  ############################################
    // $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
       int result2= (a>b)?(a>c)?a:c:(b>c)?b:c;

       System.out.println(result2);

    }
}