package FlowControlExercises;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms is: ");
        int input = sc.nextInt();
        int odds = 1;
        int counter = 0;

        for (int i = 1; i <= input; i++) {
            System.out.println(odds);
            counter += odds;
            odds += 2;
        }
        System.out.println("The Sum of odd Natural Number up to " +
                input + " terms is: " + counter);
    }
}
