package FlowControlExercises;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Input number of terms: ");
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        int i;
        double cubeArrayCal = 0;
        for (i = 1; i <= input; i++) {
            cubeArrayCal = Math.pow(i, 3);
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + Math.round(cubeArrayCal));
        }
    }
}
