package org.olenskii;

/**
 * 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
 * отрицательное, и вернуть false если положительное.
 */
public class TaskSeven {
    public static boolean isNegative(int number) {
        return (number < 0);
    }

    public static void main(String[] args) {
        int num1 = -5;
        int num2 = 10;
        int num3 = 0;

        boolean result1 = isNegative(num1);
        boolean result2 = isNegative(num2);
        boolean result3 = isNegative(num3);

        System.out.println("Число " + num1 + " отрицательное: " + result1);
        System.out.println("Число " + num2 + " отрицательное: " + result2);
        System.out.println("Число " + num3 + " отрицательное: " + result3);
    }
}

