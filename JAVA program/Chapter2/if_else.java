class if_else
{
    public static void main(String []args)
    {
        int age=35;

        if(age>=18 && age<60)
        {
          if(age>=18 && age<30)
          {
            System.out.println("You're in your 20's");
          }
          else if(age>=30 && age<40)
          {
            System.out.println("You're in your 30's,drive at any speed");
          }
          else if(age>=40 && age<50)
          {
            System.out.println("You're in your 40's,drive at speed less than 60km/hr");
          }
          else
          {
            System.out.println(" drive at any speed less than 40km/hr");
          }
        }
        else if(age>=60)
        {
            System.out.println("You can only drive car");
        }
        else{
            System.out.println("You are still a kid ");
        }
            System.out.println();
            System.out.println("please don't drink and drive ");

    }
}