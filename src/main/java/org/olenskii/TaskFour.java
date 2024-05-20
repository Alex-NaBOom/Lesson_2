package org.olenskii;

/**
 *  4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте
 *  их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести
 *  в консоль сообщение “a >= b”, в противном случае “a < b”;
 */
public class TaskFour {

    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
