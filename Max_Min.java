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
    static Stack<String> temp = new Stack<>();

    static void getUserInput(String[][] data) throws FileNotFoundException {
        System.out.println("""
                Choose option from the following:
                1. Display match with the lowest rated player.
                2. Display match with the highest rated player.
                """);
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                minElo(data);
                break;
            case 2:
                maxElo(data);
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
        int min = 10000;

            for (int i = 1; i < data.length; i++) {
                if (min > Integer.parseInt(data[i][3])) {
                    min = Integer.parseInt(data[i][3]);
                    if (min > Integer.parseInt(data[i][1])) {
                        min = Integer.parseInt(data[i][1]);
                    }
                    if (!temp.isEmpty()){
                        temp.pop();
                    }
                    temp.push(Arrays.toString(data[i]));
                }
            }
        System.out.println(temp.toString());
    }

    public static void maxElo(String[][] data) throws FileNotFoundException {
        int max = 0;

        for (int i = 1; i < data.length; i++) {
            if (max < Integer.parseInt(data[i][3])) {
                max = Integer.parseInt(data[i][3]);
                if (max < Integer.parseInt(data[i][1])) {
                    max = Integer.parseInt(data[i][1]);
                }
                if (!temp.isEmpty()){
                    temp.pop();
                }
                temp.push(Arrays.toString(data[i]));
            }
        }
        System.out.println(temp.toString());
    }





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
