




// first the stander stream of the data we gonna use is System.out to put our data

//System.out.print("Hello "); hmmmm why we need class to run this




public class Main {
    public static int counter(String dataholder) {
        int sum = 0;
        for (int i = 0; i < dataholder.length()  ; i++)
        {
            boolean o = Character.isDigit(dataholder.charAt(i));
            char c =  dataholder.charAt(i);
            int conv =  c - '0';
            if (o)
                sum += conv;
            else
            {
                System.out.print("ins't valid sicuance of number\n");
                return 0;
            }
        }
        return sum; // Return the result
    }
    public static void main(String[] args) {
        // i willl do the work for both str and int

        // with var compiler he will cast it by his self
//        var dataholder =  "479598";
        var intholder = 479598;
        String str = String.valueOf(intholder);
        //check all ints
        int sum = counter(str);
        System.out.print(sum);
    }
}
