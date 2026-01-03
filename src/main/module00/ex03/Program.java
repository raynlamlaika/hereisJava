import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// need to learn more about the buildins in JAVA


class Main
{
    public static List<Integer> spliting(String input)
    {
        String[] arrStrings = input.split(" ");
        if (arrStrings.length <= 0 || arrStrings.length == 0)
        {
            System.out.println("unexpected number of params 'may pass it empty'");
            System.exit(1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < arrStrings.length ;i++)
        {
            try 
            {
                int integer = Integer.parseInt(arrStrings[i].trim());
                list.add(integer);
            }
            catch (NumberFormatException e) 
            {

            }
            // toBeretu.addLast(integer);
            
        }
        return list;
    }

    public static void printer(LinkedList<String> input,int numberofWeeks)
    {
        int y = 1 ;
        for (String line : input)
        {
            
            List<Integer> data = spliting(line);
            int yem = Collections.min(data);
            System.out.print("Week "+ y + " ");
            for (int i = 0 ; i < yem ;i++)
            {
                System.out.print("=");
            }
            System.out.print(">"+ "\n");
            y++;
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
            System.out.print("Week " + (i+1) + "\n  ");
            String data = sc.nextLine();
            if (data.isEmpty()) // check also is digit passed or not
            {
                System.err.println("You can not enter invalid or empty data!");
                return null;
            }

            // store in linked list
            dgrees.addLast(data);
            // hold up the data and split it into array of int
        }

        // System.out.println("this is the linedlist holded out " + dgrees);
        return dgrees;
    }

    public static  void main(String[] arg)
    {

        // taking the input
        int numberofWeeks = 4;
        
        try
        {
            LinkedList<String> input = inputTaker(numberofWeeks);
            // take  the limit  inout from the user
            printer(input, numberofWeeks);

        }
        catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}
