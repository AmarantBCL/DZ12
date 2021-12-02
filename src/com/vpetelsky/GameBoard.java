package com.vpetelsky;

import com.vpetelsky.units.*;
import java.util.ArrayList;
import java.util.List;

/*
1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
Есть 4 типа юнитов: башня, забор, содат и танк.

Забор ничего не делает и может быть разрушен
Башня ничего не делает и беcсмертна
Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
Танк умеет то же что и солдат, плюс еще у него есть метод reload()

Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно.
Может быть больше классов чем перечилено в задаче если нужно.
Создать список в котором есть юниты всех типов.
*/
public class GameBoard {

    private Unit[][] battleField;
    private String fieldGraphics;
    private final List<Unit> unitList = new ArrayList<>();

    public String getFieldGraphics() {
        return fieldGraphics;
    }

    public GameBoard(int width, int height) {
        battleField = new Unit[height][width];
        drawBattlefield();
    }

    public void createUnits() {
        add(new Fence());
        add(new Tower());
        add(new Soldier());
        add(new Tank());
    }

    public void checkUnitTasks() {
        for (Unit unit : unitList) {
            if (unit instanceof Structure) {
                Structure structure = (Structure) unit;
                System.out.println(structure.getClass().getSimpleName() +
                        " is breakable: " +
                        structure.isBreakable()
                );
            } else if (unit instanceof Tank) {
                Tank tank = (Tank)unit;
                System.out.println("Tank actions: ");
                tank.move();
                tank.fire();
                tank.reload();
            } else if (unit instanceof Soldier) {
                Soldier soldier = (Soldier)unit;
                System.out.println("Soldier actions: ");
                soldier.move();
                soldier.fire();
            }
        }
    }

    public void add(Unit unit) {
        unitList.add(unit);
    }

    public void printUnitList() {
        System.out.println("Unit list: ");
        for (Unit unit : unitList) {
            System.out.println(unit.toString());
        }
        System.out.println("");
    }

    private void drawBattlefield() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < battleField.length; i++) {
            sb.append(repeatChar("+---", battleField[i].length) + "+\n");
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField[i][j] != null) {
                    Unit unit = battleField[i][j];
                    sb.append("|" + " U ");
                } else {
                    sb.append("|   ");
                }
            }
            sb.append("|\n");
        }
        sb.append(repeatChar("+---", battleField[0].length) + "+\n");
        fieldGraphics = sb.toString();
    }

    private String repeatChar(String s, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }

        return sb.toString();
    }
}
