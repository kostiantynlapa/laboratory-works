/**
 * Created by Kostiantyn Lapa 24.10.22
 */

import java.util.Scanner;

class lr22{
    public static void main(String[] args) {
        System.out.println("Task3:");
        Scanner sc = new Scanner(System.in);
        System.out.printf("type x: ");
        double x1 = sc.nextDouble();
        System.out.printf("type y: ");
        double y1 = sc.nextDouble();
        task3(x1, y1);

        System.out.printf("type x: ");
        double x2 = sc.nextDouble();
        System.out.printf("type y: ");
        double y2 = sc.nextDouble();
        task3(x2, y2);

        System.out.printf("type x: ");
        double x3 = sc.nextDouble();
        System.out.printf("type y: ");
        double y3 = sc.nextDouble();
        task3(x3, y3);

        System.out.println("Task 4:");
        int x = -3, y = 27;
        task4(x ,y);
        x = -2; y = 56;
        task4(x ,y);
        x = -1; y = 1;
        task4(x ,y);
        x = -3; y = -27;
        task4(x ,y);
    }

    static boolean task3(double x, double y){
        double eps = Math.pow(10, -3);
        double f = 6 * Math.pow(Math.cos(x), 2) - 0.25 * Math.pow(x, 5) + 3.2 * x * x - 2.7;
        if((Math.abs(f - y)) < eps) {
            System.out.println("coordinates belong to a straight line");
            return true;
        } else {
            System.out.println("coordinates doesn't belong to a straight line");
            return false;
        }
    }


    static boolean task4(int x, int y){
        double f;
        double eps = Math.pow(10, -3);
        if(Math.abs(x) > 1){
            f = Math.pow(x, 3);
        }else{
            f = Math.sqrt(2 - x * x);
        }

        if(f - y < eps){
            System.out.println("coordinates belong to a curve");
            return true;
        }else {
            System.out.println("coordinates doesn't belong to a curve");
            return false;
        }
    }
}