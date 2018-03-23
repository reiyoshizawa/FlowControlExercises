package FlowControlExercises;

import java.util.Scanner;
import java.util.Calendar;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a month number:　");
        int month = Integer.valueOf(scan.nextLine());
        System.out.println("Input a year:　");
        int year = Integer.valueOf(scan.nextLine());

        Calendar cl = Calendar.getInstance();

        month -= 1;

        String[] monthCl = {"January", "February", "March", "April", "May", "June"
        , "July", "August", "September", "October", "November", "December"};

        String monthStr = monthCl[month];

        cl.set(year,month,1);
        int days = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(monthStr + " " + year + " has " + days + " days");
    }
}
