package maths;

import maths.signs.Choose;
import maths.signs.Devide;

import java.util.Scanner;


abstract class Numbers extends Choose {
    static void domMath() throws Devide.DevideRException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое дробное число: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите второе дробное число: ");
        double num2 = sc.nextDouble();

        Choose.chose(num1, num2);
    }
}

