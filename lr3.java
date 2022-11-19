/**
 * Created by Kostiantyn Lapa 13.11.22
 */

import java.util.Arrays;
import java.util.Scanner;
class lr3{
    public static void main(String[] args) {
        // task 1
        task1(-4, 10, 0.4);

        // task 2
        int[] arr1 = {2, 1, 10, 112, 4, 20, 12, 21, 42, 2, -2, -80};
        int[] arr2 = {7, 10, 80, -180, 55, 59, 14, 111, 1212, 5545, 65};
        System.out.printf("incoming info: %s \nresult: %d \n", Arrays.toString(arr1), task2(arr1));
        System.out.printf("incoming info: %s \nresult: %d \n", Arrays.toString(arr2), task2(arr2));

        // task 3
        double x1 = 0.6, x2 = 2.8;
        System.out.printf("incoming info: %.4f \nresult: %.4f\n", x1, task3(x1));
        System.out.printf("incoming info: %.4f \nresult: %.4f\n", x2, task3(x2));
    }

    static void task1(int min_x, int max_x, double h){
        double x = min_x;
        int count = 0;
        double[] y_results = new double[35];
        double[] z_results = new double[35];
        double[] x_results = new double[35];
        while(x >= min_x && x <= max_x){
            y_results[count] = Math.sin(x * x) + Math.cos(x);
            z_results[count] = Math.sin(x) / Math.log10(x * x + 2);
            x_results[count] = x;
            count++;
            x += 0.4;
        }
        for(int i = 0; i < 65; i++){
            System.out.printf("-");
        }
        System.out.printf("\n|\tx\t|\ty(x)\t\t|\tz(x)\t\t|\n");
        for(int i = 0; i < count; i++){
            System.out.printf("|\t%.1f\t|\t%.4f\t\t|\t%.4f\t\t|\n", x_results[i], y_results[i], z_results[i]);
        }

        for(int i = 0; i < 65; i++){
            System.out.printf("-");
        }
        System.out.println();
        System.out.println();
    }

    static int task2(int[] arr){
        int minElem = 0, maxElem = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxElem){
                maxElem = arr[i];
            } else if(arr[i] < minElem){
                minElem = arr[i];
            }
        }
        return maxElem - minElem;
    }

    static double task3(double x){
        double sum = 0;
        for(int k = 1; k <= 6; k++){
            sum += factorial(k) / Math.pow(1 + x, k);
        }
        return sum;
    }

    static double factorial(int n){
        return (n == 0 || n == 1) ? n : n * factorial(n - 1);
    }
}