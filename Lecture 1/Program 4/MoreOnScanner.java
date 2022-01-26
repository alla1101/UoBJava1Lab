import java.util.Scanner;

public class MoreOnScanner {
    // More on the use of Inputs
    public static void main(String[] args) {
        // System.in means your program will read from standard input (from keyboard)
        Scanner sc_terminal=new Scanner(System.in);

        System.out.println("Enter Your name, Please ...");

        String input;
        // Reading the next word.
        input=sc_terminal.next();

        // Printing the input
        System.out.println("Welcom, mr. "+input);


        sc_terminal.close();
    }
}
