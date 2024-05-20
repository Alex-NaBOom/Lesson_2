package org.olenskii;

/**
 * 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
public class TaskSix {
    public static void main(String[] args) {
        int num = -5;
        numderSign(num); // Вызов метода numderSign с числом -5

        num = 10;
        numderSign(num); // Вызов метода numderSign с числом 10
    }
    public static void numderSign(int number) {
        if (number >= 0) {

            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

}

