import java.util.Scanner;
class votecheck{
    static void Vote(int age, String name){
     if(age>18){
        System.out.println(name + " You Are Eligible For Vote Because Your Age Is 18 Above");
     }
     else if(age==18){
        System.out.println(name +" You Are Eligible For Vote Because Your Age Is "+age);
     }
     else{
        System.out.println(name+ " You Are Not Eligible For Vote Because Your Age Is Not 18" );
     }
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    //take the name of the user
    System.out.println("Enter Your Name :");
    String name = sc.nextLine();
    //take the age value to user
    System.out.println("Enter Your Age :");
    int age = sc.nextInt();

    //call the method
    Vote(age,name);
   // close the scanner function
    sc.close();
    }
}