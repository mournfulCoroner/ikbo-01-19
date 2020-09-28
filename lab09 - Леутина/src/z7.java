import java.util.Scanner;

public class z7 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        while(true) {
            try {
                System.out.println("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Wrong input. Try again.");
                continue;
            }
            break;
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
     private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        z7 z = new z7();
        z.getKey();
    }
}
