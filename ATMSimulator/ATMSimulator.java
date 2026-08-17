import java.util.*;
import java.lang.*;

//Fixed money ATM simulator

public class ATMSimulator {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        //presetted value
        double balance = 50000;
        int pin = 1234;

        //Welcome message
        System.out.println("Welcome to Simple Bank ATM");

        //Store card number
        System.out.print("Enter your card number: ");
        scan.nextLong();

        //Store card pin
        int times = 0;
        while(times < 3){
            System.out.print("Enter your correct pin: ");
            int userpin = scan.nextInt();
            if(pin == userpin){
                System.out.println("Successfully logged");
                break;
            }
            else{
                System.out.println("You have entered incorrect pin");
                times += 1;
                System.out.print(3 - times + " more tries left");
                if(times == 3){
                    System.out.println("Your card has been locked\nPlease unlock your account in the Simple Bank!!!");
                    System.exit(0);
                }
            }
            System.out.println();
        }

        System.out.println();

        while(true){
            System.out.println("SIMPLE BANK\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Exit");
            System.out.print("Enter your option: ");
            int option = scan.nextInt();

            //Options
            switch(option){
                case 1:
                    System.out.print("Enter the money to be deposited: ");
                    double depositMoney = scan.nextDouble();
                    balance += depositMoney;
                    break;

                case 2:
                    System.out.print("Enter the money to be withdrawn: ");
                    double withdrawMoney = scan.nextDouble();
                    balance -= withdrawMoney;
                    break;

                case 3:
                    System.out.println("Your balance is ₹" + balance);
                    break;

                case 4:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
