/*
 Name: Eurecho Aque

 */
import java.io.*;
import java.util.*;

public class Sorting {

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("Chess_Raw_Data_Sets.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Integer> lines = new ArrayList<>();
        String line;
        while (true) {
            if ((line = bufferedReader.readLine()) == null) break;
            final boolean add;
        }
        bufferedReader.close();

        sort(lines.toArray(new Integer[0]));
    }

    public static void sort(Integer[] lines) {
        int counter = 1;
        int temp;
        int n = lines.length;
        // Sorting strings using bubble sort
        for (int i = 0; i < n; i++, counter ++) {
            counter++;
            for (int j = 1; j < (n - i); j++, counter ++) {
                {
                    counter++;

                    if (lines[j - 1] > lines[j])
                    {
                        counter++;
                        temp = lines[j - 1];
                        lines[j - 1] = lines[j];
                        lines[j] = temp;
                    }
                    counter++;
                }
                counter++;
            }

        }
        for (int i = 0; i < n; ++i)
            System.out.print(lines[i] + "\n");

        System.out.println();
        System.out.println("  ---Bubble Sort---");
        System.out.println("Lines executed: " + counter);

    }
}