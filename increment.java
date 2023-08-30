import java.util.Scanner;

public class increment {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your salary");
        long salary = s.nextLong();
        System.out.println("enter your rating");
        int rating = s.nextInt();

        if (rating == 1) {
            double incsalary = 0.75 * salary ;
            System.out.println("incremented salary ₹"+incsalary);
            double newsalary = incsalary+salary;
            System.out.println("The new salary ₹"+newsalary);
        }
        else if (rating == 2) {
            double incsalary = 0.50 * salary;
            System.out.println("incremented salary ₹"+incsalary);
            double newsalary = incsalary+salary;
            System.out.println("The new salary ₹"+newsalary);
        }
        else if (rating == 3) {
            double incsalary = 0.25 * salary + salary;
            System.out.println("incremented salary ₹"+incsalary);
            double newsalary = incsalary+salary;
            System.out.println("The new salary ₹"+newsalary);
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
