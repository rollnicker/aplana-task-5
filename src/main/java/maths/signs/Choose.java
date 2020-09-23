package maths.signs;

import java.util.Scanner;

import static maths.signs.Devide.devide;
import static maths.signs.Minus.minus;
import static maths.signs.Multiply.multiply;
import static maths.signs.Plus.plus;

public class Choose {
    public static void chose(double num1, double num2) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите действие: +, -, * или / ");
        String operator = sc.next();

        if (operator.contentEquals("+")) {
            plus(num1, num2);
        } else if (operator.contentEquals("-")) {
            minus(num1, num2);
        } else if (operator.contentEquals("*")) {
            multiply(num1, num2);
        } else if (operator.contentEquals("/")) {
            devide(num1, num2);
        } else {
            System.out.print("Ошибка! Вы не выбрали  +, -, * или / ");
        }
    }
}