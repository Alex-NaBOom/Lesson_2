package org.olenskii;

/**
 * 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
 * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
 * элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
 */

public class TaskThirteen {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = createMatrix(n);

        // Заполняем диагональные элементы единицами
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;          // TODO Если тут закомментировать то выведется диагональ с права на лево
            matrix[i][n - 1 - i] = 1; // TODO Если тут закомментировать то выведется диагональ с лева на право
        }

        // Выводим двумерный массив
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        return matrix;
    }
}
