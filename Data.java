import java.io. * ;
import java.util.Arrays;
import java.util.HashMap;

public class Data {
    public static final String delimiter = ",";
    public static String[][] read(String csvFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line;
            String[] chess;
            String data[][] = new String[1001][8];
            int row = 0;

            while ((line = br.readLine()) != null) {
                chess = line.split(delimiter);
                for (int x = 0; x < chess.length - 1; x++) {
                    data[row][x] = chess[x];
                }
                row++;
            }
            // System.out.println(Arrays.deepToString(data[1000]));
            return data;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  Temporary method, may or may not be useless and redundant.
     *  Keep for now just in case it can be used.
     */
    public static void category(){
        HashMap<String, Integer> category = new HashMap<>();
        category.put("Black", 0 );
        category.put("BlackElo", 1);
        category.put("White", 2);
        category.put("WhiteElo", 3);
        category.put("Date", 4);
        category.put("Event", 5);
        category.put("First Move", 6);
        category.put("Category", 7);
        category.put("Weekday", 8);
    }
}