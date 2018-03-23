package FlowControlExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Input the 2nd number: ");
        int num2 = Integer.valueOf(scan.nextLine());
        System.out.println("Input the 3rd number: ");
        int num3 = Integer.valueOf(scan.nextLine());

        int[] arrayGreatest = {num1, num2, num3};
        int zero = 0;
        for (int i = 0; i < arrayGreatest.length; i++){
            zero = Math.max(zero, arrayGreatest[i]);
        }
        System.out.println("The greatest: " + zero);
    }
}
