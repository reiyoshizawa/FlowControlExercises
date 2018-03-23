package FlowControlExercises;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Input the 5 numbers: ");
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        String fiveNumString = String.valueOf(input);
        int sum = 0;
        double average = 0;
        System.out.println("Input the 5 numbers:");
        for (int i = 1; i <= fiveNumString.length(); i++) {
            System.out.println(i);
            sum += i;
            average = sum / fiveNumString.length();
        }
        System.out.println("The sum of 5 is: " + sum);
        System.out.println("The Average is: " + average);
    }

}
