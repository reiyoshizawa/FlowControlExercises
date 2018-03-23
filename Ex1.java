package FlowControlExercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
            boolean positive = input > 0;
            boolean negative = input < 0;
            if (positive) {
                System.out.println("Number is positive");
            } else {
                System.out.println("Number is negative");
            }
    }
}
