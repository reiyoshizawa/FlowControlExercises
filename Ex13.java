package FlowControlExercises;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        System.out.println("Input number of terms: ");
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        int i = 0;
        int multipleResult = 0;
        for (i = 0; i <= input; i++) {
            multipleResult = input * i;
            System.out.println(input + " X " + i + " = " + multipleResult);
        }
    }
}
