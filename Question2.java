import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     
    */
    Scanner in = new Scanner(System.in);
     //prompt user for weight
    System.out.println("Enter Weight in KG: ");
    //"read" weight
    double weight = in.nextDouble();

    //prompt user for height
    System.out.println("Enter Height in m: ");
    //"read height"
    double height = in.nextDouble();
    
    double bmi = weight / (height*height);
    //print bmi
    System.out.println("Your bmi is: " + bmi);
  }
} 
