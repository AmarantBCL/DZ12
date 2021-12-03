package com.vpetelsky;

import com.vpetelsky.model.*;

import java.util.Random;

public class GameBoard {

    private Unit[][] battleField;
    private String fieldGraphics;
    private Team[] teams;

    public GameBoard(int width, int height, Team team1, Team team2) {
        battleField = new Unit[height][width];
        teams = new Team[] { team1, team2 };
        drawBattlefield();
        initialUnitPlacement();
    }

    public void showBattlefield() {
        System.out.println(fieldGraphics);
    }

    private void drawBattlefield() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < battleField.length; i++) {
            sb.append(repeatChar("+---", battleField[i].length) + "+\n");
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField[i][j] != null) {
                    Unit unit = battleField[i][j];
                    sb.append("|" + unit.getMark() + unit.getTeam().getNumber());
                } else {
                    sb.append("|   ");
                }
            }
            sb.append("|\n");
        }
        sb.append(repeatChar("+---", battleField[0].length) + "+\n");
        fieldGraphics = sb.toString();
    }

    private void initialUnitPlacement() {
        for (Team team : teams) {
            for (Unit unit : team.getUnitList()) {
                tryToPlace(unit);
            }
        }
        drawBattlefield();
    }

    private void tryToPlace(Unit unit) {
        if (getUnitCount() + 1 > battleField.length * battleField[0].length) {
            return;
        }
        Random random = new Random();
        int x = random.nextInt(battleField.length);
        int y = random.nextInt(battleField[0].length);
        if (battleField[x][y] == null) {
            placeUnit(unit, x, y);
        } else {
            tryToPlace(unit);
        }
    }

    private int getUnitCount() {
        int count = 0;
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField[i][j] != null) {
                    count++;
                }
            }
        }
        return count;
    }

    private void placeUnit(Unit unit, int x, int y) {
        battleField[x][y] = unit;
        unit.setLocation(x, y);
    }

    private String repeatChar(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
