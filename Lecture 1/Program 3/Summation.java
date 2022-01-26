// importing the library used for reading input from user
import java.util.Scanner;

public class Summation {
    // Get two numbers into the program, and print their summation
    public static void main(String[] args) {
        // Two variables cabable of storing integer values only!
        int x,y;
        x=5;
        y=10;
        int sum=x+y;
        // Casting to strings and printing the values
        System.out.println(x+"+"+y+"="+sum);

        // Now Add Scanner Library to get input from keyboard
        // The System.in is the inputstream through which the input will come from 
        Scanner Sc=new Scanner(System.in);
        // Asking for input 1
        System.out.print("Please, Enter the Value of X:");
        x=Sc.nextInt();
        // Asking for input 2
        System.out.print("Please, Enter the Value of Y:");
        y=Sc.nextInt();
        
        // Calculating Results
        sum=x+y;
        // Printing output for user
        System.out.println("The Summation Result is: "+sum);

        // Closing connection. Not necessary but represents clean (non-lazy) programming style
        Sc.close();
    }
}
