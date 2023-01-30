import java.io. * ;
public class Read {
    public static final String delimiter = ",";
    public static void read(String csvFile) {
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
                System.out.println(data[row][4] + "");
                row++;
            }

        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

}