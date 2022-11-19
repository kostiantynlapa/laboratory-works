/**
 * Created by Kostiantyn Lapa 01.10.22
 */

import java.util.Scanner;
import java.util.Date;

// створення класу Lr1
public class lr1 {
    // створення метода main
    public static void main(String[] args){
        // ввід змінних і присвоєння їм значень
        double x, y;
        x = 0.335;
        y = 0.025;
        // виведення в консоль вхідних данних
        System.out.printf("incoming info: x = %.3f, y = %.3f \n", x, y);
        // виведення в консоль результатів виконання методів CalcS, CalcR
        System.out.printf("Result S: %.4f \n", calcS(x));
        System.out.printf("Result R: %.4f \n", calcR(x, y));

        // застосування сканера
        Scanner sc = new Scanner(System.in);
        System.out.println("Type X: ");
        x = sc.nextDouble();
        System.out.println("Type Y: ");
        y = sc.nextDouble();
            
        // виведення в консоль результатів виконання методів CalcS, CalcR та outputDate
        System.out.printf("Result S: %.4f \n", calcS(x));
        System.out.printf("Result R: %.4f \n", calcR(x, y));
        outputDate();
    }

    // створення методів CalcS, CalcR, outputDate
    static double calcS(double x){
        // метод вертає результат виконання заданої функцї зі змінною x
        return 1 + x + Math.pow(x, 2) / 2 + Math.pow(x, 3) / 6 + Math.pow(x, 4) / 24;
    }

    static double calcR(double x, double y){
        // метод вертає результат виконання заданої заданої функції зі змінними x та y
        return x * (Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2)); 
    }

    static void outputDate(){
        // метод вертає поточну дату
        System.out.printf("Date: %1$tH : %1$tM : %1$tS", new Date());
    }
}