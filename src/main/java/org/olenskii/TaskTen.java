package org.olenskii;

/**
 * 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class TaskTen {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("  Исходный массив: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println(" ");

        // Заменяем 0 на 1 и 1 на 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        // Выводим измененный массив
        System.out.print("Измененный массив: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}

