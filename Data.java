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
            String data[][] = new String[1001][9];
            int row = 0;

            while ((line = br.readLine()) != null) {
                chess = line.split(delimiter);
                for (int x = 0; x <= chess.length - 1; x++) {
                    data[row][x] = chess[x];
                }
                row++;
            }
            System.out.println("Dataset has been successfully loaded!\n");
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

}