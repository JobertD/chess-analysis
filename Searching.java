/**
 * Group 2
 * Ian M. Cristino
 * CS221-9321 LAB
 */

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;

public class Searching {
    static Scanner in = new Scanner(System.in);

    static String input;

    public static String userInput() {
        System.out.print("\nSearch a game/username: ");
        input = in.next();
        return input;
    }


    public static void search(String[][] data) throws FileNotFoundException {
        int count = 0;

        do {
            userInput();
            //Finds the user input in the dataset
            //And shows the details of the game
            //By showing the row
            for (int i = 0; i < 1001; i++) {
                for (int j = 0; j < 9; j++) {
                    if (input.equals(data[i][j])) {
                        count++;
                        System.out.println("\n" + Arrays.deepToString(data[i]));
                    }
                }
            }
            //If user input is not found in the dataset,
            // show error message.
            if (count == 0) {
                System.out.println("\nUsername/Game is not found in the dataset.");
            }
        } while (input.equalsIgnoreCase("y"));
        }
    }

