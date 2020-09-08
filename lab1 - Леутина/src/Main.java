import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void HarmonicSeries()
    {
        for(float i = 1; i <= 10; i++)
        {
            System.out.print(1/i + " ");
        }
    }
    public static void Fact(int n)
    {
        int f = 1;
        for(int i = 2; i <= n; i++)
        {
            f *= i;
        }
        System.out.print(n + "! = " + f + "\n");
    }
    public static void RandMas(int n)
    {
        int sum = 0;
        int[] mas = new int[n];
        for(int i = 0; i < n; i++)
        {
            mas[i] = (int) (Math.random() * 1000);
            sum += mas[i];
            System.out.print(mas[i] + " ");
        }
        System.out.print("Sorted array:\n");
        Arrays.sort(mas);
        for(int i = 0; i < n; i++) System.out.print(mas[i] + " ");
        System.out.print("\nSum of array: " + sum);
    }
    public static void main(String[] args)
    {
        HarmonicSeries();
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fact(n);
        RandMas(n);
    }
}
