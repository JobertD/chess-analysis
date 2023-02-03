import java.util.*;

public class Filtering {
    static Scanner sc = new Scanner(System.in);

    public static void filter(String[][] data) {
        int quan = 0;
        System.out.println("""
                
               
                FILTER CHOICES
                1. Black
                2. Black Elo
                3. White
                4. White Elo
                5. Date
                6. Event
                7. First Move
                8. Category
                9. Weekday""");
        System.out.println("Please Enter the corresponding number of your choices...\n");
        System.out.print("How many categories would you like to filter? ");
        quan = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int x = 1; x <= quan; x++) {
            System.out.print("Filter - " + x + ": ");
            int choice = sc.nextInt() - 1;
            list.add(choice);
        }
        Collections.sort(list);
        System.out.println();

        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < quan; x++) {
                System.out.printf("| %-25s |", data[y][list.get(x)]);
            }
            System.out.println();


        }
    }
}
