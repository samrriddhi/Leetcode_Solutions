import java.util.Scanner;

public class SumOfNnumbers {

    public int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        SumOfNnumbers obj = new SumOfNnumbers();
        int result = obj.sum(n);

        System.out.println("Sum = " + result);
    }
}