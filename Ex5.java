package FlowControlExercises;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex5 {
    public static void main(String[] args) {
        // 12.47832642
        // 12.47832099
        Scanner scan = new Scanner(System.in);
        System.out.println("Input floating-point number: ");
        String floatNum1 = scan.nextLine();
        System.out.println("Input floating-point another number: ");
        String floatNum2 = scan.nextLine();

        BigDecimal bdFloatNum1 = new BigDecimal(floatNum1);
        BigDecimal bdFloatNum2 = new BigDecimal(floatNum2);

        BigDecimal bd4FloatNum1 = bdFloatNum1.setScale(3, RoundingMode.DOWN);
        BigDecimal bd4FloatNum2 = bdFloatNum2.setScale(3, RoundingMode.DOWN);

        if (bd4FloatNum1.equals(bd4FloatNum2)) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("nope");
        }
    }
}
