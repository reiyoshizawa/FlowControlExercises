package FlowControlExercises;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Input the number:");
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        int i = 0;
        int counter = 0;
        System.out.println("The first n natural numbers are:");
        for (i = 1; i <= input; i++) {
            System.out.println(i);
            counter += i;
        }
        System.out.println("The Sum of Natural Number up to 2 terms: " + counter);
    }
}
