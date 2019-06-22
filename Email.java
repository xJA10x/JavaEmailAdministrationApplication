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

    // Call a method
    // asking for the deparment.
    // Return the deparment.

  }

  // Ask for the deparment.
  // Builds private method.
  // Takes no parameters.
  private String setDepartment() {

    // Builds object from
    // the class Scanner
    // in order to store user's input.
    Scanner input = new Scanner(System.in);

    // Prompts user.
    System.out.print("Enter the deparment\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");

    // Stores input for the deparment.
    input.nextInt();

  }

  // Generate a random password.

  // Set the mailbox capacity.

  // Set the alternate email.

  // Change the password.





}
