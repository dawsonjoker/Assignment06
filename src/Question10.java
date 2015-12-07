
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    //Create method
    public static boolean sameDashes(String first, String second) {
        //Find length of first word
        int length1 = first.length();
        //Find length of second word
        int length2 = second.length();
        //Find the smaller word
        int smallest = length1;
        if (length1 > length2) {
            smallest = length2;
        }
        //Create for loop to check each character of the word
        for (int i = 0; i < smallest; i++) {
            //Find the dash(es) in the first word
            if (first.charAt(i) == '-') {
                //If second word dash locations are not equal to first, return false
                if (second.charAt(i) != '-') {
                    return (false);
                }
            }
        }
        //If first word is longer, check ending for dashes and return false if any are found
        if (length1 > length2) {
            String end = first.substring(smallest);
            if (end.contains("-")) {
                return (false);
            }
            //If second word is longer, check ending for dashes and return false if any are found
        } else {
            String end = second.substring(smallest);
            if (end.contains("-")) {
                return (false);
            }
        }
        //If nothing is stopped by the above code, return true because words are equal
        return (true);
    }

    public static void main(String[] args) {
        //Create Scanner 
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.println("Please enter the first string: ");
        String first = input.nextLine();
        System.out.println("Please enter the second string: ");
        String second = input.nextLine();
        //Send strings to other method
        boolean sameDashes = sameDashes(first, second);
        //Return answer to user
        boolean answer = sameDashes(first, second);
        if(answer==true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
