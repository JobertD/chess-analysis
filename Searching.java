/**
 * Group 2
 * Ian M. Cristino
 * CS221-9321 LAB
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;

public class Searching {

    public static final String delimiter = ",";
    static Scanner in = new Scanner(System.in);
    public static void search(String[][] data) throws FileNotFoundException {
        String input = "";
        int count = 0;

            //Asks user for input to search in the data set
            System.out.print("Search for a game: ");
            input = in.nextLine();
            //Finds the user input in the dataset
            //And shows the details of the game
            //By showing the row
            for(int i = 0; i < 1001; i++) {
                for (int j = 0; j < 9; j++) {
                    if (input.equals(data[i][j])){
                        count++;
                        System.out.println(Arrays.deepToString(data[i]));
                    }
                }
            }
            //If user input is not found in the dataset,
            // show error message.
            if (count == 0) {
                System.out.println("Username/Game is not found in the dataset.");
            }
        }

    }
