package FlowControlExercises;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Input second number: ");
        int second = Integer.valueOf(scan.nextLine());
        System.out.println("Input third number: ");
        int third = Integer.valueOf(scan.nextLine());
        if (first == second && second == third && third == first) {
            System.out.println("All numbers are equal");
        } else if (first != second && second != third && third != first) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

