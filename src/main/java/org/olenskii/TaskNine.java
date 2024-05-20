package org.olenskii;

/**
 *  9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
 *  не високосный - false). Каждый̆ 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class TaskNine {

    public static void main(String[] args) {
        int year1 = 2023;
        int year2 = 2024;
        int year3 = 1986;
        int year4 = 2000;

        System.out.println(year1 + " високосный: " + isLeapYear(year1));
        System.out.println(year2 + " високосный: " + isLeapYear(year2));
        System.out.println(year3 + " високосный: " + isLeapYear(year3));
        System.out.println(year4 + " високосный: " + isLeapYear(year4));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false; // Не делится на 4, значит не високосный
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false; // Делится на 100, но не на 400, значит не високосный
        } else {
            return true; // Делится на 4, или на 400, значит високосный
        }
    }
}

