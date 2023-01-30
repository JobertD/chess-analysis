import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataset;

    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            printMenu("This application is made to handle basic data processing\" +\n" +
                    "\"\\using an external file as a dataset. Example of such data files are\" +\n" +
                    "\"\\nCSV, TXT, or JSON files.",
                    "\nLoad a dataset", "Filter Categories", "Search data",
                    "Sort data", "Find Minimum and Maximum");
            choice = enterChoice("",1 ,5);

            switch (choice){
                case 1:
                    String file = fileName();
                    dataset = Data.read(file);
                case 2:
                    //Filtering();
                case 3:
                    //Searching();
                case 4:
                    //Sorting();
                case 5:
                    //Max_min();
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
            return choice;
        }
    }

        public static void pressEnter () {
            System.out.println("PLease Press ENTER to continue...");
        }

        public static void exit () {
            System.out.println("Thank you for using the Application!!!" +
                    "\nClosing... Have a nice day!!!");
            System.exit(0);
        }
    }
}
