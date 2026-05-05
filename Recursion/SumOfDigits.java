import java.util.Scanner;

public class SumOfDigits {

    public static int sumofdigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumofdigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int result = sumofdigits(n);
        System.out.println("Sum of digits = " + result);
    }
}