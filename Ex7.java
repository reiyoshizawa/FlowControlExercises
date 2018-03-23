package FlowControlExercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scan.nextLine();

        int inputNum = input.length();
        String alphabet = "[a-zA-Z]";
        boolean notEqual = !input.matches(alphabet);

        if (input.equals("a") || input.equals("i") || input.equals("u")
                || input.equals("e") || input.equals("o")) {
            System.out.println(input + " letter is Vowel");
        } else if (inputNum > 1 || notEqual) {
            System.out.println("error");
        } else {
            System.out.println(input + " letter is Consonant");
        }
    }
}
