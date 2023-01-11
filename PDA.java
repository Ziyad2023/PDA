import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    int age;

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    // younger age computation
    public int getYoungerAge(int age) {
        return (age / 2) + 7;
    }
    
    // older age computation
    public int getOlderAge(int age) {
        return (age - 7) * 2;
    }    

    int LOWER_BOUND = 14;
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
     Scanner scanner = new Scanner(System.in);
     boolean shouldContinue = true;
       
       // ask for user input
       while (shouldContinue) {
       System.out.println("How old are you?");
       
       // parse int data
       try {
           age = scanner.nextInt();

           // age can't be below lower bound
           if (age < LOWER_BOUND) {
             System.out.println(age+" is too young!!");
           } else {
             System.out.println("Computations go here");                
            }
           
            // print results
           System.out.println("lowest dating age is " + getYoungerAge(age));
           System.out.println("oldest dating age is " + getOlderAge(age));
           
       // catch invalid data
       } catch (InputMismatchException error) {
           scanner.next();
           System.out.println("Please enter an integer");
       }
       
       // user can enter 0 to quit program
       System.out.println("To quit program, enter 0");
       
       // check if user entered 0
       if (age == 0) {
           shouldContinue = false;
       } else {
           shouldContinue = true;
       }
     }
    }
    
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

