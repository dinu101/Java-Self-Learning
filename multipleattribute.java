    // Define a public class named multipleattribute

public class multipleattribute {

  // Declare instance variables (properties) of the class
  String fname = "John";     // First name of the person
  String lname = "Doe";      // Last name of the person
  int age = 24;              // Age of the person

  // Main method – entry point of the program
  public static void main(String[] args) {

    // Create an object of the Main class
    multipleattribute myObj = new multipleattribute();

    // Access the object's properties and print the full name
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);

    // Access and print the age of the person
    System.out.println("Age: " + myObj.age);
  }


}
