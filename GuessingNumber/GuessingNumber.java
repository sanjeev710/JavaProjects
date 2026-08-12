import java.util.*;

public class GuessingNumber{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Welcome to the Guessing Number Game!!!");
    System.out.println("Please select a level to play the game");
    System.out.println("1. Easy (1 - 50)\n2. Medium (1 - 100)\n3. Hard (1 - 200)");
    int level = scan.nextInt();

    int guess = 0;
    int count = 1;

    switch(level){
      case 1:
        guess = rand.nextInt(50)+1;
        break;
      case 2:
        guess = rand.nextInt(100)+1;
        break;
      case 3:
        guess = rand.nextInt(200)+1;
        break;
    }

    while(true){
      System.out.printf("Guess a number between 1 and %d: ", (level == 1) ? 50 : (level == 2) ? 100 : 200);

      int user = scan.nextInt();

      if(user == guess){
        System.out.println("You guessed the correct number!!!");
        System.out.println("You guessed the number in " + count + " tries");
        break;
      }
      else if(user < guess){
        System.out.println("Your guess is lower than the correct number");
        count++;
      }
      else{
        System.out.println("Your guess is higher than the correct number");
        count++;
      }
    }

    scan.close();
  }
}