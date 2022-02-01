import java.util.Scanner;

public class assignment {
    public static void main(String[] args){
        double x,y,result;
        x=y=0;
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Enter 1st Number: ");
            x=scanner.nextDouble();
            System.out.print("Enter 2st Number: ");
            y=scanner.nextDouble();
            
        }catch(Exception inputError){
            System.out.println("Input is not Supported");
            System.exit(1);
        }

        System.out.println("Resulting Calculations:");
        result=x+y;
        System.out.println("x+y="+result);
        result=x-y;
        System.out.println("x-y="+result);
        result=x*y;
        System.out.println("x*y="+result);
        
        if(y < -0.00001 || y > 0.00001 ){
            result=x/y;
            System.out.println("x/y="+result);
        }else{
            System.out.println("x/y= undefined");
        }

        scanner.close();

    }
}
