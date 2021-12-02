package com.vpetelsky;

/*
2*) Задана строка из английских слов через пробел. Написать метод который возвращает те же слова в
обратном порядке. При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.
*/
public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
    }

    private static void task1() {
        GameBoard gb = new GameBoard();
        gb.createUnits();
        gb.printUnitList();
        gb.checkUnitTasks();
    }

    private static void task2() {
        String myStr = "John likes swimming";
        System.out.println(myStr + " <--> " + reverseString(myStr));
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        String words[] = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            char c = words[i].charAt(0);
            int index = sb.length();
            sb.append(words[i] + " ");
            sb.setCharAt(index, Character.toUpperCase(c));
        }

        return sb.toString().trim();
    }
}
