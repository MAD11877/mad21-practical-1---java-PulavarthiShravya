import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    
    //prompt user for number
    System.out.println("Enter number: ");
    
    //"read" user input
    int num = in.nextInt();

    //multiply it self 
    int newNum = num * num;

    //print the number
    System.out.println(newNum);
    
  }
}
