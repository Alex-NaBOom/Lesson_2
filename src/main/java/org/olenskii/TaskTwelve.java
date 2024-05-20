package org.olenskii;

/**
 *  12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2;
 */
public class TaskTwelve {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проходим по массиву циклом
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2; // Умножаем число на 2, если оно меньше 6
            }
        }

        // Выводим измененный массив
        System.out.print("Измененный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
