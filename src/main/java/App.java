import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    //getting user input
    System.out.println("What is your desired lenght of your Rectangle");
    int intLength = myScanner.nextInt();
    System.out.println("What is your desired width of your Rectangle");
    int intWidth = myScanner.nextInt();

    //we call the issquare method on the new rectangle
    Rectangle rectangle = new Rectangle(intLength, intWidth);
    boolean sqResult = rectangle.isSquare();
    System.out.println("Is your rectangle a square, too?" + "  "+ sqResult + "!");
  }
}
