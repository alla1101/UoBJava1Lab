import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc_terminal=new Scanner(System.in);
        int x,y,z;
        float average;

        // Receive 3 inputs
        
        System.out.print("1st number: ");
        x=sc_terminal.nextInt();
        
        System.out.print("2st number: ");
        y=sc_terminal.nextInt();
        
        // Here we will use next to read it as a string, then the string will be converted to integer !
        System.out.print("3st number: ");
        z=Integer.parseInt(  sc_terminal.next()  );
        
        // Calculate their average
        average=(float) ((x+y+z)/3.0);

        // Print The Average
        System.out.println("("+x+"+"+y+"+"+z+")/3 ="+average);

        // More on Casting
        int toInt=(int) average;
        System.out.println(toInt);

        // What if it was a string !!
        String number="10.2";
        // The number in the string is double, so we use parseDouble to convert string into a double, then cast it into an integer using (int)
        toInt=(int) Double.parseDouble(number);
        System.out.println(toInt);

        sc_terminal.close();

    }
}
