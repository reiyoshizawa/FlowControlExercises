package FlowControlExercises;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Input second number: ");
        int second = Integer.valueOf(scan.nextLine());
        System.out.println("Input third number: ");
        int third = Integer.valueOf(scan.nextLine());
        if (first < second && second < third) {
            System.out.println("increasing");
        } else if (first > second && second > third) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

