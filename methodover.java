// Java program to demonstrate Method Overloading
class methodOver {

    // Method Overloading: Method with two int parameters
    // This method adds two integers and returns the result
    static int MethodOver(int x, int y) {
        return x + y;
    }

    // Method Overloading: Method with two double parameters
    // This method adds two double numbers and returns the result
    static double MethodOver(double x, double y) {
        return x + y;
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        
        // Calling the integer version of MethodOver
        int myNum1 = MethodOver(5, 5); // Passes two int values
        
        // Calling the double version of MethodOver
        double myNum2 = MethodOver(10.2, 23.78); // Passes two double values

        // Printing the results
        System.out.println("Sum of integers: " + myNum1);
        System.out.println("Sum of doubles: " + myNum2);
    }
}
