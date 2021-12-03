package com.vpetelsky;

import com.vpetelsky.model.*;

/*
2*) Задана строка из английских слов через пробел. Написать метод который возвращает те же слова в
обратном порядке. При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.
*/
public class Main {

    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();
        GameBoard gb = new GameBoard(3, 5, team1, team2);
        gb.showBattlefield();
    }
}
