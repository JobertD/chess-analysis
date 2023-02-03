/**
 * Group 2
 * Ian M. Cristino
 * CS221-9321 LAB
 */

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.*;

public class Searching {
    static Scanner in = new Scanner(System.in);
    static String input;


    //User Input method which asks user for input
    public static String userInput() {
        System.out.print("\nSearch with a game detail: ");
        input = in.nextLine();
        return input;
    }


    //Search method to find the user input in the data set
    public static void search(String[][] data) throws FileNotFoundException {
        int count = 0;
        userInput();
        //Finds the user input in the dataset
        //And shows the details of the game by showing the row
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (input.equalsIgnoreCase(data[i][j])) {
                    count++;
                    System.out.println(Arrays.deepToString(data[i]));
                }
            }
        }

        //If user input is not found in the dataset,
        // show error message.
        if (count == 0) {
            System.out.println("\nUsername/Game is not found in the dataset.");
        }

    }
    public static boolean repeat() {
        boolean loop = true;
        boolean pick = false;

        while (loop){
            System.out.print("\nWould you like to search again? [Y/N] ");
            String choice = in.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                pick = true;
                loop = false;
            } else if ((!choice.equalsIgnoreCase("n"))) {
                System.out.println("Please Pick Between Y/N... ");
            }
            else{
                loop = false;
            }
        }

        return pick;
    }
}

