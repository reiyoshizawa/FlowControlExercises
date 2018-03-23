package FlowControlExercises;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println("Input number of n: ");
        Scanner scan = new Scanner(System.in);
        int rows = Integer.valueOf(scan.nextLine());

        int num = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
        scan.close();
    }
}
