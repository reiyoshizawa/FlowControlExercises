package FlowControlExercises;

import java.util.Scanner;

public class Ex19 {
    // get number of rows: 4
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // for each line, print numbers based on the line number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.valueOf(scan.nextLine());

        int odd = 1;
        int even = 0;

        for(int row = 1; row <= rows; row++) {

            for(int col = 0; col < row; col++) {
                if (row % 2 == 0) {
                    System.out.print(even + " ");
                    System.out.print(odd + " ");
                } else {
                    System.out.print(odd + " ");
                    System.out.print(even + " ");
                }
            }

            System.out.println();
        }
        scan.close();
    }
}
