
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    //Create compoundInterest method
    public static double compoundInterest(double initial, double rate, int year) {
        //Calculate post balance
        double post = Math.pow((1 + rate), year) * initial;
        //Round post balance to 2 decimal places
        post = Math.round(post * 100) / 100.0;
        //Return new balance
        return post;
    }

    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Get user input
        //Get initial balance of account
        System.out.print("Please enter the current balance of your account: ");
        double initial = input.nextDouble();
        //Get interest rate from user
        System.out.print("Please enter your interest rate: ");
        double rate = input.nextDouble();
        //Get number of years from user
        System.out.print("Please enter the number of years: ");
        int year = input.nextInt();
        //Send values to method for calculation
        double post = compoundInterest(initial, rate, year);
        //tell user the new balance of their account
        System.out.println("Your new account balance is " + post);
    }
}
