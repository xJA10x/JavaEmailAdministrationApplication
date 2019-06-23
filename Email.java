/*****************************************

Email Class

*****************************************/

// Imports scanner class in
// order to store user's input.
import java.util.Scanner;

// Encapsulation.
  // The idea of hiding complex details.
  // For example:
    // Making variables private and
    // access them through set() and get() methods.

    // A class is a blueprint,
    // it is our template.

    // This refers to the
    // class level variable.

public class Email {

  // Declares private variables.
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String altenateEmail;
  private int mailboxCapacity;
  private int defaultPasswordLength;

  // Buidls constructor.
  // Takes two parameters,
  // private global variables firstName
  // and lastName.
  // Constructor is called as soon as
  // an instance of a class is declared.
  public Email(String firstName, String lastName) {

    // Stores input in the variable
    // firstName.
    this.firstName = firstName;
    // Stores input in the variable
    // secondName.
    this.lastName = lastName;

    // Outptuts to the console.
    System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

    // Method call.
    // Ask for the deparment.
    // Stores input
    // in the global variable  deparment.
    // Returns the deparment.
    this.department = setDepartment();
    // Outputs to the console.
    System.out.println("Department: " + this.department);

    // Method call.
    // Takes one parameter,
    // global private variable defaultPasswordLength.
    // Stores output in the variable password.
    // Method that returns a random password.
    this.password = randomPassword(defaultPasswordLength);
    // Outputs to the console.
    System.out.println("Your password is : " + this.password);

  }

  // Ask for the deparment.
  // Builds private method.
  // Takes no parameters.
  private String setDepartment() {

    // Builds object from
    // the class Scanner
    // in order to store user's input.
    Scanner input = new Scanner(System.in);

    // Declares variable to store user's input.
    int deepChoice;

    // Prompts user.
    System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for none\nEnter department code: ");
    // Stores input
    // the variable deparmentChoice.
    deepChoice = input.nextInt();

    // Builds if statement.
    if(deepChoice == 1) {

      // Returns word sales.
      return "sales";

    } else if(deepChoice == 2) {

      // Returns development word.
      return "development";

    } else if(deepChoice == 3) {

      // Returns accounting word.
      return "Accounting";

    } else {

      // Returns empty string.
      return "";

    }

  }

  // Builds private method.
  // Takes one parameter,
  // how long a password should be.
  // Generates a random password.
  private String randomPassword(int length) {

    // Initializes variable.
    String passwordSet = "ABCDEFGIJKLMNOPQRSTUWXYZ0123456789!@#$%";
    // Initializes array.
    char[] password = new char[length];

    // Builds for loop.
    // Iterates through the value of length.
    for(int i = 0; i < length; i++) {

      // Method call
      // using object name.
      // Takes one parameter.
      // Type cast as an integer and multiplies by
      // the length of the password.
      // Generates random number.
      // Stores output in the variable rand.
      int rand = (int)(Math.random() * passwordSet.length());

      // Method call
      // using object name.
      // Takes one parameter,
      // stores output in the array password.
      password[i] = passwordSet.charAt(rand);


    }

    // Returns password.
    return new String(password);

  }

  // Set the mailbox capacity.

  // Set the alternate email.

  // Change the password.


}
