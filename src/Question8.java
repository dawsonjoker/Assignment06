
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    //Create method
    public static String season(int month, int day) {
        //Create season variable
        String season = "season";
        //Calculate if the season is fall
        if (month == 9 && day >= 16 || month == 10 || month == 11 || month == 12 && day <= 15) {
            season = "fall";
        }
        //Calculate if the season is summer
        if (month == 6 && day >= 16 || month == 7 || month == 8 || month == 9 && day <= 15) {
            season = "summer";
        }
        //Calculate if the season is winter
        if (month == 12 && day >= 16 || month == 1 || month == 2 || month == 3 && day <= 15) {
            season = "winter";
        }
        //Calculate if the season is spring
        if (month == 3 && day >= 16 || month == 4 || month == 5 || month == 6 && day <= 15) {
            season = "spring";
        }
        return season;
    }

    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("please enter a month: ");
        int month = input.nextInt();
        System.out.print("Please enter a day: ");
        int day = input.nextInt();
        String season = season(month, day);
        //Tell user the season
        System.out.println("the season is " + season);
    }
}
