import java.util.Scanner;


//and about the public and pravite class is about the the acessbilty in of the package
public class Main
{
    private int sum = 0;

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        sum++; // count function entry

        for (int i = 2; i * i <= n; i++) {
            sum++; // count iteration
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


//    public  void main(String[] args)
//    {
//        // so the next execie is about
//// Böhm-Jacopini theorem says that any algorithm can be written using three statements:
//// sequence, selection, and iteration.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("you can enter ur input from here:");
//        String input = sc.nextLine();
//        if (input.isEmpty())
//            System.err.print("you can not enter in empty input!!\n");
//        int checkint = Integer.parseInt(input);
//        int i = isPrime(checkint);
//        System.out.print("this is the out put:");
//        if (i == 0)
//        {
//            System.out.print("true :" + app.sum + "\n");
//
//        }
//
//        System.out.print("flase :" + app.sum + "\n");
////        System.out.print(checkint);
//
//    }
//
//
//}
public static void main(String[] args) {

    Main app = new Main(); // needed to call non-static methods

    Scanner sc = new Scanner(System.in);
    System.out.print("You can enter your input here: ");

    String input = sc.nextLine();
    if (input.isEmpty()) {
        System.err.println("You cannot enter empty input!");
        return;
    }

    int checkInt = Integer.parseInt(input);

    boolean result = app.isPrime(checkInt);

    System.out.print("This is the output: ");
    if (result) {
        System.out.println("true : " + app.sum);
    } else {
        System.out.println("false : " + app.sum);
    }

    sc.close();
}
}