/***********************************

EmailApp class

*************************************/

// Imports Scanner class
// to store user's input.
import java.util.Scanner;

public class EmailApp {

  public static void main(String[] args) {

    // Outputs empty line.
    System.out.println("");
    // Outputs to the console.
    System.out.println("################## Running Program ###################");
    // Outputs empty line.
    System.out.println("");

    // Builds object from the class
    // Scanner in order to stores user's input.
    Scanner input = new Scanner(System.in);

    // Declares loop control variable.
    int control;

    // Prompts user.
    System.out.print("Enter -1 to quit program or another integer to run the program: ");
    // Stores input in the variable control.
    control = input.nextInt();
    // Outputs empty line.
    System.out.println("");

    // Builds sentinel while loop.
    while(control != -1) {

      // Builds object
      // from the class Email.
      // Constructor takes two parameters.
      Email em1 = new Email("John", "Smith");

      // Prompts user.
      System.out.print("Enter -1 to quit program: ");
      // Stores input in the variable control.
      control = input.nextInt();
      // Outputs empty line.
      System.out.println("");

      // Builds if statement.
      if(control == -1) {

        // Outputs to the console.
        System.out.println("Thanks for using the program");

      } else {

        // Outputs to the console.
        System.out.println("Ok, let's do this");

      }

    }

    // Ouputs empty line.
    System.out.println("");
    // Outputs to the console.
    System.out.println("################## Exiting Program ####################");
    // Outputs empty line.
    System.out.println("");

  }

}
