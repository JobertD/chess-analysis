/*
 Name: Eurecho Aque

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the CSV file: ");
        String fileName = input.nextLine();

        ArrayList<String[]> rows = readCSV(fileName);
        System.out.print("Enter the number of the column to sort by: ");
        int columnIndex = input.nextInt();
        sort(rows, columnIndex);

        for (String[] row : rows) {
            for (String cell : row) {
                System.out.print(cell + ",");
            }
            System.out.println();
        }
    }

    public static ArrayList<String[]> readCSV(String fileName) {
        ArrayList<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return rows;
    }

    public static void sort(ArrayList<String[]> rows, int columnIndex) {
        Collections.sort(rows, (row1, row2) -> row1[columnIndex].compareTo(row2[columnIndex]));
    }

    public static void sort(String[][] dataset) {
    }
}
