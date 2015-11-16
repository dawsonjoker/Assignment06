
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class Question1 {

    public static double circleArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Create scanner
        Scanner input = new Scanner (System.in);
        
        //Get user input
        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();
        double answer = circleArea(radius);
        
        //Display area 
        System.out.println("The area of the circle is " + answer);
    }
}
