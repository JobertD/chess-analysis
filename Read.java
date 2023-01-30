import java.io. * ;
import java.util.HashMap;

public class Read {
    public static final String delimiter = ",";
    public static void read(String csvFile) {
        HashMap <String, Integer> category = new HashMap<>();
        category.put("Black", 0 );
        category.put("BlackElo", 1);
        category.put("White", 2);
        category.put("WhiteElo", 3);
        category.put("Date", 4);
        category.put("Event", 5);
        category.put("First Move", 6);
        category.put("Category", 7);
        category.put("Weekday", 8);

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = " ";
            String[] chess;
            String[][] data = new String[1001][10];
            int row = 0;

            while ((line = br.readLine()) != null) {
                chess = line.split(delimiter);
                for (int x = 0; x < chess.length - 1; x++) {
                    data[row][x] = chess[x];
                }
                System.out.println(data[row][2] + "");

                row++;
            }

        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

}