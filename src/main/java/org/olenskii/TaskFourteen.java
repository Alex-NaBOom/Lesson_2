package org.olenskii;

/**
 * 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
 * массив типа int длиной len, каждая ячейка которого равна initialValue.
 */
public class TaskFourteen {
    public static void main(String[] args) {
        int len = 7;
        int initialValue = 7;

        int[] array = createArray(len, initialValue);

        // Выводим элементы массива
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
