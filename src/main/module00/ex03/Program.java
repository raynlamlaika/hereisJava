import java.util.Scanner;
import java.util.LinkedList;
// need to learn more about the buildins in JAVA


class Main
{
    public static void printer(LinkedList<String> input,int numberofWeeks)
    {
        for (String line : input)
        {
            int[] data = spliting(line);
            // take the minimum and put the line
            drawLine();
        }
    }
    public static boolean checkdigit(String data)
    {
        if (data.isEmpty())
            return false;
        for (char c :  data.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static LinkedList<String> inputTaker(int nbr)
    {
        String[] holder = null;
        LinkedList<String> dgrees = new LinkedList<>();

        for (int i = 0 ; i < nbr ;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Week" + (i+1) + "\n");
            String data = sc.nextLine();
            if (data.isEmpty) // check also is digit passed or not
            {
                System.err.println("You can not enter invalid or empty data!");
                return null;
            }

            // store in linked list
            dgrees.addLast(data);
            // hold up the data and split it into array of int
        }

        System.out.print("this is the linedlist holded out \n"+ dgrees);
        return dgrees;
    }

    public static  void main(String[] arg)
    {

        // taking the input
        int numberofWeeks = 4;
        LinkedList<String> input = inputTaker(numberofWeeks);
        //  split every string and put the min number of egree in = to build line ====>
        printer(input, numberofWeeks);
    }


}


