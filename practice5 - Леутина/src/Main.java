import java.util.Scanner;

public class Main {
    //14. Цифры числа слева направо
    //Дано натуральное число N. Выведите все его цифры по одной, в обычном
    //порядке, разделяя их пробелами или новыми строками.
    public static void st(int N)
    {
        if(N < 10)
        {
            System.out.println(N);
            return;
        }
        st(N/10);
        System.out.println(N%10);

    }
    public static void main(String[] args)
    {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        st(N);
    }
}
