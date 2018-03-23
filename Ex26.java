package FlowControlExercises;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion: ");
        int input = Integer.valueOf(scan.nextLine());

        long tenBillion = 10000000000L;
        if (input < tenBillion){
            String strDigits = String.valueOf(input);
            int digitsLength = strDigits.length();
            System.out.println("Number of digits in the number: " + digitsLength);
        }
    }
}

