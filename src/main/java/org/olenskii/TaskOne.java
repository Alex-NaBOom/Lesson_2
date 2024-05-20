package org.olenskii;

/**
 * 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 */
public class TaskOne {
    public static void main(String[] args) {
        printThreeWords();
        printThreeWordsTwo();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void printThreeWordsTwo() { // TODO Простой варинат
        System.out.println("Orange2");
        System.out.println("Banana2");
        System.out.print("Apple2");
    }
}