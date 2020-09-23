package maths;
import maths.signs.Choose;

import java.util.Scanner;


abstract class Numbers extends Choose {
static void domMath(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите первое дробное число: ");
    int num1 = sc.nextInt();
    System.out.print("Введите второе дробное число: ");
    int num2 = sc.nextInt();

        Choose.chose(num1, num2);
    }
}

