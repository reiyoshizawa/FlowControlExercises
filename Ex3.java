package FlowControlExercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value: ");
        float input = Integer.valueOf(scan.nextLine());

        if (input == 0) {
            System.out.println("zero");
        } else if (input > 0) {
            System.out.println("positive");
            if (input > 1000000) {
                System.out.println("large");
            }
        } else if (input < 0) {
            System.out.println("negative");
        } else if (input > Math.abs(1)) {
            System.out.println("small");
        }
    }
}
