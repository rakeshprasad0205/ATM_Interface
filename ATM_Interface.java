import java.util.Scanner;
import javax.lang.model.util.*;

public class ATM_Interface 
{

    public static void main(String arg[]) 
    {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw cash");
            System.out.println("Choose 2 for deposit cash");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Quit");
            System.out.println("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter amount to be withdrawn:");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Enter amount to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your amount has been successfully deposited");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

}
