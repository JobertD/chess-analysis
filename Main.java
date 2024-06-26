import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataset;

    public static void main(String[] args) throws FileNotFoundException {
        int choice = 0;

        while (true) {
            boolean picked = true;
            printMenu("\nThis application is made to handle basic data processing using an external\n" +
                    "file as a dataset. Example of such data files are CSV, TXT, or JSON files.\n\n" +
                    "========== MAIN MENU ========== \n",
                    "Load a dataset","View dataset", "Filter Categories", "Search data",
                    "Sort data", "Find Minimum and Maximum");
            choice = enterChoice("\nWhat would you like to do? ",1 ,7);

            switch (choice){
                case 1:
                    String file = fileName();
                    dataset = Data.read(file);
                    pressEnter();
                    break;
                case 2:
                    Table.showTable(dataset);
                    pressEnter();
                    break;
                case 3:
                    while (picked) {
                    Filtering.filter(dataset);
                        picked = repeat();
                    }
                    pressEnter();
                    break;
                case 4:
                    while (picked) {
                        Searching.search(dataset);
                        picked = repeat();
                    }
                    pressEnter();
                    break;
                case 5:
                    while (picked) {
                        Sorting.sort(dataset);
                        picked = repeat();
                    }
                    pressEnter();
                    break;
                case 6:
                    while (picked) {
                        Max_Min.getUserInput(dataset);
                        picked = repeat();
                    }
                    pressEnter();
                    break;
                case 7:
                    System.out.println("Thank you for using the Application!!!" +
                            "\nClosing... Have a nice day!!!");
                    System.exit(0);
            }
        }
    }


    public static String fileName() {
        String csvFile = "Chess_Raw_Data_Sets.csv";
        // System.out.println("Please Enter the File Name of the Dataset you want to Access: ");
        // csvFile = sc.nextLine();
        return csvFile;
    }

    public static void printMenu(String header, String... choices) {

        int choiceNum = 1;
        System.out.println(header);

        for (String choice : choices) {
            System.out.printf("%d. %s\n", choiceNum, choice);
            choiceNum++;
        }
    }


    public static int enterChoice(String prompt, int min, int max) {
        Scanner kbd = new Scanner(System.in);
        int choice;

        while (true) {
            try {
                System.out.print(prompt);
                choice = Integer.parseInt(kbd.nextLine());
                if (choice < min || choice > max) {
                    System.out.printf("Error: your input must be between %d and %d.\n", min, max);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: your input must be an integer value.\n");
                continue;
            }
        }
        return choice;
    }

        public static void pressEnter () {
            System.out.println("PLease Press ENTER to continue...");
            sc.nextLine();
        }

         public static boolean repeat() {
             boolean loop = true;
             boolean pick = false;

             while (loop) {
                 System.out.print("\nWould you like to search again? [Y/N] ");
                 String choice = sc.nextLine();
                 if (choice.equalsIgnoreCase("y")) {
                     pick = true;
                     loop = false;
                 } else if ((!choice.equalsIgnoreCase("n"))) {
                     System.out.println("Please Pick Between Y/N... ");
                 } else {
                     loop = false;
                 }
             }

             return pick;
         }
}
