import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for the first x coordinate
  System.out.println("Please enter in the x coordinate of the first point");
  double x1 = input.nextInt();
  // ask the user for the first y coordinate
  System.out.println("Please enter in the y coordinate of the first point");
  double y1 = input.nextInt();
  // ask the user for the second x coordinate
  System.out.println("Please enter in the x coordinate of the second point");
  double x2 = input.nextInt();
  // ask the user for the second y coordinate
  System.out.println("Please enter in the y coordinate of the second point");
  double y2 = input.nextInt();

  // formula for slope
  double formula = (y2 - y1) / (x2 - x1);

  // tell the user their slope
  System.out.println("The slope of your line would be " + formula + ".");

    
  }
}
