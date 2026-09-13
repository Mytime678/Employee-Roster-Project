import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to the employee Roster!");

        // Display their options and ask for their choice
        System.out.println("1. Employee Roster");
        System.out.println("2. Manager Roster");
        System.out.println("3. Exit");

        System.out.println(); // Empty space

        Scanner sc = new Scanner(System.in);

        // Verify user choice
        // set variables for userchoice varifications
        boolean valid = false;
        int choice = 0;

        while(!valid) {
            System.out.print("Which would you like to see? (1/2/3): ");
            String userInput = sc.nextLine();
            try {
                choice = Integer.parseInt(userInput);

                if(choice >= 1 && choice <= 3) {
                    valid = true;
                } else {
                    System.out.println("The number must be between 1 and 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between 1 and 3");
            }
        }

        if (choice == 1) {
            System.out.println("What you like to do with the employee Roster?");
            System.out.println("1. Add a new employee profile");
            System.out.println("2. Edit an employee profile");
            System.out.println("3. Delete an employee profile");
            System.out.println("4. View all employee profiles");
            System.out.println("5. Back");
        }



        // test
        System.out.println(choice);

    }
}
