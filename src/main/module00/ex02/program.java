
import java.util.Scanner;


public class Main
{
    // take help from the prev ex01
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        // so the programe should take in str and check if the number is prime or not
        // 123 1 + 2 + 3 = 6 -> not prime so the sequ
//        Main app = new main();
        Scanner sc = new Scanner(System.in);
        System.out.print("You can enter your data here: ");

        String data = sc.nextLine();
        if (data.isEmpty()) {
            System.err.println("You cannot enter empty data!");
            return;
        }
        int sum = 0;
        for (int i = 0 ; data.length() > i; i++)
        {
            char c = data.charAt(i);
            int o = c - '0';
            sum += o;
        }
        boolean helper = isPrime(sum);
        if (helper)
        {
            System.out.print("the number is prime so" + sum+ "\n");
        }
        else
        {
            System.out.print("the number isn't prime no req ae reseved\n");
        }



    }
}