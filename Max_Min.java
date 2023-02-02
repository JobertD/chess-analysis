/*
    Programmer: Andrei Jas C. Dagatay
    Class name: Max_Min Class
    Class Function: Sorts the highest values per category among the given set

 */
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Max_Min {

    private static String input;
    static Scanner scan = new Scanner(System.in);
    static int choice;

    static void getUserInput(String[][] data) throws FileNotFoundException {
        System.out.println("""
                Choose option from the following:
                1. Display the lowest rated player.
                2. Display the highest rated player.
                3. Percentage of chess games based on date.
                4. Percentage of chess games based on opening move.
                5. Percentage of chess games based on game type. 
                """);
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                minElo(data);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }

    public static void minElo(String[][] data) throws FileNotFoundException {
        String min = "";

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (data[i][4].equals(Integer.parseInt(min))) {
                        min = data[i][4];
                    }
                    if (data[i][2].equals(Integer.parseInt(min))) {
                        min = data[i][2];
                    }
                }
            }
        System.out.println(min);
    }

   /* public static void maxElo(String[][] data) throws FileNotFoundException {
        String max;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j > data.length; j++) {
                if(data[i][j].compareToIgnoreCase(Integer.valueOf(max))) {
                    max = data[i][j];
                }
            }
    }
*/




        class MinAndMax {
            public int max(int[] array) {
                int max = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            }

            public int min(int[] array) {
                int min = array[0];

                for (int i = 0; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                return min;
            }
            // System.out.println("Highest Elo: " + statistics.getMax());
            // System.out.println("Lowest Elo: " + statistics.getMin());

        }
    }
