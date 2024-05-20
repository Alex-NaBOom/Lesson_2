package org.olenskii;

/**
 * 8. Напишите метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class TaskEight {

    public static void main(String[] args) {
        String text = "Привет!";
        int repetitions = 2;

        repeatString(text, repetitions);
    }

    public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }


}
