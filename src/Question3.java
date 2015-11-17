
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    //Create factors method
    public static void factors(int mainFactor) {
        //checks every number less than the mainFactor
        for (int i = 1; i <= mainFactor; i++) {
            //if the number divides evenly, it is a factor
            if (mainFactor % i == 0) {
                System.out.println("Factors (" + mainFactor + ") = " + i);
            }
        }

    }

    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter a number to receive factors: ");
        int num = input.nextInt();
        factors(num);
    }
}
