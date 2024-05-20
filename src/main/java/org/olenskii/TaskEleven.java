package org.olenskii;

/**
 * 11.  Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
 */
public class TaskEleven {

    public static void main(String[] args) {
        int[] array = new int[100]; // Создаем пустой массив длиной 100

        // Заполняем массив значениями 1, 2, 3, ... 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Выводим заполненный массив
        System.out.print("Заполненный массив: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

}

