package org.olenskii;

/**
 * 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
 * в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class TaskFive {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 12;
        int sum = a + b;
        if (sum >= 10) {
            System.out.println("true");
        } else if (sum <= 20) {
            System.out.println("false");

        }
    }

}
