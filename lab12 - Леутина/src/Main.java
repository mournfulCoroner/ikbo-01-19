import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*3.	Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.
– пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
– пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(
                 "^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|[2-9]\\d)\\d{2}))$"
                + "|^((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|[2-9]\\d)\\d{2}))$"
                + "|^((0[1-9]|[12][0-8])/02/(19|[2-9][0-9])\\d{2})$"
                + "|^(29/02/(19|[2-9]\\d)(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96))$");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) System.out.println("Correct");
        else System.out.println("Incorrect");
    }
}
