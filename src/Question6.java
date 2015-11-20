
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    //Create method
    public static int lastDigit(int num) {
        //Calculate the last digit of the number
        num = num % 10;
        return (num);
    }

    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int last = lastDigit(num);
        //tell user the last digit
        System.out.println("Last digit is " + last);
    }
}
