import java.util.Scanner;

public class leapmonth {
    int year;
    int month;
    boolean isLeapMonth;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        leapmonth lm = new leapmonth();

        // Get input from user
        System.out.print("Enter the year: ");
        lm.year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        lm.month = scanner.nextInt();

        // Boolean expressions from the question
        lm.isLeapMonth = (lm.year % 4 == 0);
        lm.isLeapMonth = lm.isLeapMonth && (lm.month % 100 != 0)
                         || lm.isLeapMonth || (lm.month % 400 == 0);

        // Output result
        if (lm.isLeapMonth) {
            System.out.println("Month " + lm.month + " of year "
                               + lm.year + " IS a leap month.");
        } else {
            System.out.println("Month " + lm.month + " of year "
                               + lm.year + " is NOT a leap month.");
        }

        scanner.close();
    }
}
