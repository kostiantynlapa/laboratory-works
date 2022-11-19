/**
 * Created by Kostiantyn Lapa 24.10.22
 */

class lr21 {
    public static void main(String[] args) {
        double x1 = -2.3, x2 = 0.6, x3 = 4.8;
        System.out.println("task1: ");
        System.out.printf("result: %.4f \n", task1(x1));
        System.out.printf("result: %.4f \n", task1(x2));
        System.out.printf("result: %.4f \n", task1(x3));


        System.out.println("task2: ");
        task2(x1);
        task2(x2);
        task2(x3);
    }

    static double task1(double x) {
        double y = 0.0, a = 0.5, b = 0.7, c = 3.4;
        if (x < a)
            y = c * Math.pow(Math.sin(b * b * x), 2) + Math.log(c * x + a); // For x = x1: under the sign of the logarithm is a negative value, so result is NaN
        if (x < b && x >= a)
            y = a + Math.log(b * x) - Math.sin(c * x);
        if (x >= b)
            y = Math.sqrt(Math.abs(Math.cos(a + b * x) + c * x * x));
        System.out.printf("incoming info: x = %.4f, a = %.4f, b = %.4f, c = %.4f \n", x, a, b, c);
        return y;
    }

    static double task2(double x) {
        double a = 0.5, b = 4.5, z = Math.pow(Math.E, a * x), y = 0.0;

            if (x <= 5 * a)
                y = 2.5 * b * b + a * x - 4.5 * Math.cos(x * z);
            if (x > b)
                y = Math.pow(a * a - 5.4 * x, 3) + Math.log(x * z);
            if (x > 5 * a && x <= b)
                y = Math.sqrt(6.5 * b * b + a - Math.pow(x, 3) * z);
            System.out.printf("incoming info: x = %.4f, a = %.4f, b = %.4f, z = %.4f \n", x, a, b, z);
            System.out.printf("result %.4f \n", y);

            b = 3.7; z = Math.pow(Math.E, 2 * a * x);
            if (x <= 5 * a)
                y = 2.5 * b * b + a * x - 4.5 * Math.cos(x * z);
            if (x > b)
                y = Math.pow(a * a - 5.4 * x, 3) + Math.log(x * z);
            if (x > 5 * a && x <= b)
                y = Math.sqrt(6.5 * b * b + a - Math.pow(x, 3) * z);
            System.out.printf("incoming info: x = %.4f, a = %.4f, b = %.4f, z = %.4f \n", x, a, b, z);
            System.out.printf("result %.4f \n", y);

            b = 2.7; z = Math.pow(Math.E, 2.5 * a * x);
            if (x <= 5 * a)
                y = 2.5 * b * b + a * x - 4.5 * Math.cos(x * z);
            if (x > b)
                y = Math.pow(a * a - 5.4 * x, 3) + Math.log(x * z);
            if (x > 5 * a && x <= b)
                y = Math.sqrt(6.5 * b * b + a - Math.pow(x, 3) * z);
            System.out.printf("incoming info: x = %.4f, a = %.4f, b = %.4f, z = %.4f \n", x, a, b, z);
            System.out.printf("result %.4f \n", y);
            return y;
        }
    }