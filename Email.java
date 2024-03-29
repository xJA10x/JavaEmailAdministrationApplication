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
  private String email;
  private String alternateEmail;
  // Initializes variable.
  private int defaultPasswordLength = 10;
  private String companySuffix = "aeycompany.com";
  private int mailboxCapacity = 500;

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

    // Method call.
    // Ask for the deparment.
    // Stores input
    // in the global variable  deparment.
    // Returns the deparment.
    this.department = setDepartment();

    // Method call.
    // Takes one parameter,
    // global private variable defaultPasswordLength.
    // Stores output in the variable password.
    // Method that returns a random password.
    this.password = randomPassword(defaultPasswordLength);
    // Outputs to the console.
    System.out.println("Your password is : " + this.password);

    // Combine elements to generate emails.
    // Stores output in the variable email.
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

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
    System.out.print("New Worker: " + firstName + ". \nEnter the Deparment Codes:\n1 for Sales\n2 for Development\n3 for none\nEnter department code: ");
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

  // Builds method.
  // Takes one parameter,
  // sets the mailbox capacity.
  public void setMailboxCapacity(int capacity) {

    // Stores input in the
    // variable mailboxCapacity.
    this.mailboxCapacity = capacity;
  }

  // Builds method.
  // Takes one parameter,
  // sets the alternate email.
  public void setAlternateEmail(String altEmail) {

    // Stores input in
    // the variable altEmail.
    this.alternateEmail = altEmail;

  }

  // Builds method.
  // Takes one parameter,
  // changes the password.
  public void changePassword(String password) {

    // Stores input in the variable
    // password.
    this.password = password;

  }

  // Builds method.
  // Takes no parameters,
  // get() method.
  public int getMailboxCapacity() {

    // Returns mailboxCapacity.
    return mailboxCapacity;

  }

  // Builds method.
  // Takes no parameters,
  // get() method.
  public String getAlternateEmail() {

    // Returns alternateEmail.
    return alternateEmail;

  }

  // Builds method.
  // Takes no parameters,
  // get() method.
  public String getPassword() {

    // Returns password.
    return password;

  }

  // Builds method.
  // Takes no parameters.
  public String showInfo() {

    return "DISPLAY NAME: " + firstName + " " + lastName +
          "\nCOMPANY EMAIL: " + email +
          "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

  }

}
