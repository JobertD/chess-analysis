/*
    Programmer: Andrei Jas C. Dagatay
    Class name: Max_Min Class
    Class Function: Sorts the highest values per category among the given set

 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Max_Min {

    private static void minAndMax() {
        try (Stream<String> stream = Files.lines(Paths.get("Chess_Raw_Data_Sets.csv"))) {
            IntSummaryStatistics statistics = stream
                    .map(s -> s.split(",")[1])
                    .mapToInt((Integer::valueOf))
                    .summaryStatistics();
            System.out.println("Highest Elo: " + statistics.getMax());
            System.out.println("Lowest Elo: " + statistics.getMin());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
