package maths.signs;

public abstract class Devide {
    protected static double devide(double a, double b) throws DevideRException {

        double y = 0;
        if (b != 0) {
            y = a / b;
            System.out.println(y);
        } else if (b == 0) {
            System.out.println("Делить на 0 нельзя");
            throw new DevideRException();
        }
        return y;
    }

    public static class DevideRException extends Exception {
        private double equal;
    }
}
