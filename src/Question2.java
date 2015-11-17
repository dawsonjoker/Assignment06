
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class Question2 {
    /**
     * @param args the command line arguments
     */
    //Create examGrade method
    //int grade is a temporary storage variable to allow math to be done in this method
    public static void examGrade(int grade){
        //Outprint corresponding letter to the grade they input
        if(grade < 50){
            System.out.println("You got an F");
        }
        if(grade >= 50 && grade <=59){
            System.out.println("You got a D");
        }
        if(grade >=60 && grade <=69){
            System.out.println("You got a C");
        }
        if(grade >=70 && grade <=79){
            System.out.println("You got a B");
        }
        if(grade >= 80){
            System.out.println("You got an A");
        }
    }
    
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter an exam score: ");
        int score = input.nextInt();
        //Temporairly store score in int grade to allow math to be done in the above method
        examGrade(score);
    }
}