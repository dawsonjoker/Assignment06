
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    //Create method
    public static boolean allDigitsOdd(int num) {
        //calculate if all digits are odd
        while (true) {
            //Get the last digit of the number
            int math = num % 10;
            //If numbers are odd
            if (math == 9
                    || math == 7
                    || math == 5
                    || math == 3
                    || math == 1) {
                //remove digits that have already been checked
                num = num / 10;
            }
            //If numbers are even
            if (math == 8
                    || math == 6
                    || math == 4
                    || math == 2) {
                //return false to the user
                return false;
            }
            //If the number is equal to zero, end the program
            if (num == 0) {
                break;
            }
        }
        //If it has passed the above code without breaking, return true
        return true;
    }

    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //get user input 
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        //Send to allDigitsOdd
        boolean answer = allDigitsOdd(num);
        System.out.println(answer);
    }
}
