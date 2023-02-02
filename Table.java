import java.util.Arrays;
import java.util.Scanner;

public class Table {
    static Scanner sc = new Scanner(System.in);

    public static void showTable(String[][] array) {
        int width = array[0].length, pageQuan = 50, pageNum = array.length / pageQuan, count = 0, y, curr = 1;

        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        while (count < width) {
            System.out.printf("| %-25s |", array[0][count]);
            count++;
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (y = 1; y < array.length; y++) {
            for (int x = 0; x <= width - 1; x++) {
                System.out.printf("| %-25s |", array[y][x]);
            }
           System.out.println();

            if ((y % pageQuan) + 1 == 1) {
                System.out.println("\nShowing " + y + " results" +
                        "\nPage " + curr + " of " + pageNum +
                        (curr == 1 ?"\n":"\nP: Previous    ") + "B: Back    ENTER: Next\n");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("p")) {
                    y = y - (pageQuan * 2);
                    curr--;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                } else if (choice.equalsIgnoreCase("b")) {
                    pageNum = 0;
                    break;
                }
                else {
                    curr++;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }
    }
}

