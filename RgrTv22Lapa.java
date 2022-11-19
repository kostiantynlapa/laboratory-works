/**
 * Created by Kostiantyn Lapa on 30.10.22
*/

import java.util.Scanner;

class RgrTv22Lapa {
    public static void main(String[] args) {
        // Task1
        double[][] a = {
                {10, -9, -2, -9, -2, 101.4},
                {-8, 10, 7, 7, 1, -127.7},
                {-10, 10, 0, 4, -8, -87},
                {1, -10, -6, 2, 7, 102.9},
                {-7, 7, -10, -5, -9, -20.9},
        };
        System.out.println("Початкова матриця:");
        task13(a);
        double[][] triangleMatrix = task11(a);
        double[][] vectorOfResults = task12(triangleMatrix);
        System.out.println("Трикутникова матриця:");
        task13(triangleMatrix);
        System.out.println("Вектор результатiв:");
        task13(vectorOfResults);

        // Task2
        Scanner sc = new Scanner(System.in);
        System.out.printf("type your number: ");
        int v1 = sc.nextInt();
        System.out.printf("result: %d \n", task2(v1));
        System.out.printf("type your number: ");
        v1 = sc.nextInt();
        System.out.printf("result: %d \n", task2(v1));

        System.out.printf("type your number: ");
        v1 = sc.nextInt();
        System.out.printf("result: %d \n", task2(v1));


    }

    static double[][] task11(double[][] b) {
        int rows = b.length;
        for (int k = 1; k < rows; k++) {
            for (int j = k; j < rows; j++) {
                double m = b[j][k - 1] / b[k - 1][k - 1];
                for (int i = 0; i < rows + 1; i++) {
                    b[j][i] -= m * b[k - 1][i];
                }
            }
        }
        return b;
    }

    static double[][] task12(double[][] a) {
        double[][] x = new double[1][a.length];
        int rows = a.length;
        for (int i = rows - 1; i >= 0; i--) {
            x[0][i] = a[i][rows] / a[i][i];
            for (int c = rows - 1; c > i; c--) {
                x[0][i] -= a[i][c] * x[0][c] / a[i][i];
            }
        }
        return x;
    }

    static void task13(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Double.parseDouble(String.format("%.3f", matrix[i][j])); // Приводимо кожен елемент до 3 знаків після коми у форматі String
                // та переводимо назад у Double
                    if (matrix[i][j] % 1 == 0) {
                        System.out.printf("%d ", (int) matrix[i][j]);
                    } else System.out.printf("%.3f ", matrix[i][j]);

            }
            System.out.println();
        }
    }

    static int task2(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}