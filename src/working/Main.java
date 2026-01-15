

import java.util.Scanner;
import annotations.ValidString;

// import java.util.String;
// import java.util.Character;


// public class Main {
//     enum Statusi {
//     LEARNER,
//     DEVELOPER,
//     EXPERT,
//     PROFESSIONAL
// }

//     public static void main(String[] args) {
//         // working with enum
//         Statusi tel = Statusi.DEVELOPER;

//         switch (tel) {
//             case LEARNER:
//                 System.out.println("You are a learner");
//                 break;
//             case DEVELOPER:
//                 System.out.println("You are a developer");
//                 break;
//             case EXPERT:
//                 System.out.println("You are an expert");
//                 break;
//             case PROFESSIONAL:
//                 System.out.println("You are a professional");
//                 break;
//             default:
//                 System.out.println("Unknown status");
//                 break;
//         }
//     }
// }



public class Main {

    public enum PassSalary {
        RH(5000),
        DEVELOPER(100000),
        MANAGER(1200),
        CEO(123000),
        INTERN(12);

        private final int salary;

        PassSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
    }

    // salary program
    public static void main(String[] args) {

        System.out.println("What is your level?");
        Scanner sc = new Scanner(System.in);
        String holder = sc.nextLine().toUpperCase();

        String[] values = {"RH", "DEVELOPER", "MANAGER", "CEO", "INTERN"};

        for (String value : values) {
            if (holder.equals(value)) {
                try {
                    PassSalary s = PassSalary.valueOf(holder);
                    System.out.println("Your salary is: " + s.getSalary());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid level entered.");
                }
                sc.close();
                return;
            }
        }

        System.out.println("Invalid level entered.");
        sc.close();
    }
}


// anotations in java  


class Creating
{
    public static void printing(@ValidString String he)
    {
        if (null == he)
        {
            System.out.print("empty string is passing\n");
            return ;
        }
        System.out.print("printing: ");
        for (int i = 0  ; he.length()  > i ; i++)
        {
            if (Character.isLowerCase(he.charAt(i)))
                System.out.print(he.charAt(i));
            else
                System.out.print(".");
        }
        System.out.print('\n');
    }
}


// check why we can creat in mualtiple public classes in same file!!
class Pushing extends Creating
{
    // @overwrite
    public static void printing( String he)
    {
        
        if (null == he)
        {
            System.out.print("empty string is passing\n");

        }
        for (int i = 0  ; he.length()  > i ; i++)
        {
            if (Character.isUpperCase(he.charAt(i)))
                System.out.print(he.charAt(i));
            else
                System.out.print(".");
        }
        System.out.print('\n');
    }
}




