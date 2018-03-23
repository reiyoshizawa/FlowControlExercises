package FlowControlExercises;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Input number of n: ");
        Scanner scan = new Scanner(System.in);
        int rows = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= rows; i++) {
            int spaces = rows - i;
            for(int col = 1; col <= rows - spaces; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

        scan.close();
    }
}
