import java.util.Scanner;
import java.util.InputMismatchException;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word:");
    boolean state = false;
    while(!state){
      try {
        String word = in.nextLine();
        state = true;
        int a = word.length();
        System.out.println("The length of the word is: " + a);
		  } catch (InputMismatchException e) {
		      System.out.println("Input error, try again");
		  }
      in.nextLine();
    }
    
    
  }
}
