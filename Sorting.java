/*
 Name: Eurecho Aque

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.list;

public class Sorting {
    static Scanner sc = new Scanner(System.in);

    public static void sort(String[][] data) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("""
                
                SORT BY
                1. Black
                2. Black Elo
                3. White
                4. White Elo
                5. Date
                6. Event
                7. First Move
                8. Category
                9. Weekday
                How would you like the data sorted? """);
        int sortBy = sc.nextInt() - 1;

        for (int x = 1; x < data.length; x++){
            String temp = data[x][sortBy];
            data[x][sortBy] = data[x][0];
            data[x][0] = temp;
        }
        for (String[] datum : data) {
            list.add(Arrays.toString(datum));
        }
        System.out.println(list.getFirst());
        list.removeFirst();
        Collections.sort(list);
        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
        System.out.println();
    }
}
