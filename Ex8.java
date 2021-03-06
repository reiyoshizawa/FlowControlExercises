package FlowControlExercises;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = Integer.valueOf(scan.nextLine());

        // check whether year is leap year
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
