
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    //Create chaotic method
    public static void chaotic(int numLines) {
        //Create loop for number of lines\
        int lineCount = 0;
        while (numLines != lineCount) {
            //Calculate a random output of asteriks
            int randNum = (int) (Math.random() * (5)) + 1;
            for (int numAsterik = randNum; numAsterik > 0; numAsterik--) {
                System.out.print("*");
            }
            System.out.println("");
            lineCount++;
        }
    }

    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter number of lines you wish to have: ");
        int numLines = input.nextInt();
        //Send variable to other method
        chaotic(numLines);
    }
}
