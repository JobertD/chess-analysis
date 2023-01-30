import java.util.Arrays;

public class Table {
    public static void showTable(String[][] array) {
        int width = array[0].length, page = width/50, count = 0, curr = 0 ;

        System.out.println("\n-------------------------------------------------------------------------------");
        while (count <= width) {
            System.out.printf("| %-15s |", array[0][count]);
            count++;
        }
        System.out.println("\n-------------------------------------------------------------------------------");

        //for (int y = 1; y < array.length - 1; y++) {
         //   for (int x = 0; x <= width - 1; x++) {
        //        System.out.printf("| %-15s |", array[y][x]);
          //  }
       // }

    }
}
