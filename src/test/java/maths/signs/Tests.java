package maths.signs;
import static maths.signs.Plus.plus;
import static maths.signs.Devide.devide;
import static maths.signs.Minus.minus;
import static maths.signs.Multiply.multiply;
import static maths.signs.Plus.plus;

import org.junit.Assert;
import org.junit.Test;


public class Tests {

    double num1 = 14.99;
    double num2 = 12;


    @Test
    public void findPlus() {
        double number = plus(num1, num2);
        Assert.assertEquals(num1 + num2, number, 0 );
    }
    @Test
    public void findMinus() {
        double number = minus(num1, num2);
        Assert.assertEquals(num1 - num2, number, 0 );
    }
    @Test
    public void findDevide() throws Devide.DevideRException {
        double number = devide(num1, num2);
        Assert.assertEquals(num1 / num2, number, 0 );
    }
    @Test
    public void findMultiply() {
        double number = multiply(num1, num2);
        Assert.assertEquals(num1 * num2, number, 0 );
    }
    @Test (expected =  Exception.class)
    public void findDevideException() throws Devide.DevideRException {
        double number = devide(10, 0);
    }
}
