import java.util.Scanner;


    class guesser{
        int guessNum;
        int guessingNumber(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Guesser! Kindly guess the number:");
            
             guessNum=scan.nextInt();
            return guessNum;
        }
    }

    class Player{
        int guessNum;
        int guessingNumber(){
            Scanner scan = new Scanner(System.in);

            System.out.println("player Kindly guess the number:");
            
             guessNum=scan.nextInt();
            return guessNum;
        }
    }
    
    class umpire{

        int numFromGuesser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

       void  collectNumFromGuesser()
       {
         guesser  g=new guesser();
          numFromGuesser= g.guessingNumber();
        }
      void  collectNumFromPlayers()
      {
           Player  p1=new Player();
           Player  p2=new Player();
           Player  p3=new Player();

            numFromPlayer1= p1.guessingNumber();
            numFromPlayer2= p2.guessingNumber();
            numFromPlayer3= p3.guessingNumber();
        }

      void  compare()
      {
               if(numFromGuesser==numFromPlayer1)
               {
                System.out.println("Player1 won the game");
               }
               else if(numFromGuesser== numFromPlayer2)
               {
                System.out.println("Player 2 won the game");
               }
               else if(numFromGuesser== numFromPlayer3)
               {
                System.out.println("Player 3 won the game");
               }
               else{
                System.out.println("sb haar gye sb ka galat hai");
               }
        }
    }

    public class Launch1
    {

    public static void main(String []args)
    {
        System.out.println("start the game!!!");

       umpire U=new umpire();

       U.collectNumFromGuesser();
       U.collectNumFromPlayers();
       U.compare();

    }
}