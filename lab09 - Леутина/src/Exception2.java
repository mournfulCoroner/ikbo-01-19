import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString); System.out.println( 2 / i );
        }
        catch (Exception e){
            System.out.println("Incorrect input");
        }
        finally {
            System.out.println("Great Job!");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
