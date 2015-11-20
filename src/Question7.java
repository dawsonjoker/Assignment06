
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    //Create method
    public static int firstDigit(int num) {
        //Calculate first digit
        num = num / 10;
        while (true) {
            if (num > 10) {
                num = num / 10;
            }
            return (num);
        }
    }

    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        //Send value to other method
        int first = firstDigit(num);
        //Tell user the first digit
        System.out.println("First digit is " + first);
    }
}
