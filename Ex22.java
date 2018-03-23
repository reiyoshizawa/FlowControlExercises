package FlowControlExercises;

import java.util.Scanner;

public class Ex22 {
    //  space -> input
    //  * -> (input - line)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        for(int line = 1; line <= input; line++) {
            for(int at = 1; at < line; at++) {
                System.out.print(" ");
            }
            for(int sp = 0; sp <(input-line) + 1; sp++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
