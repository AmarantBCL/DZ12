package com.vpetelsky.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private static int count = 0;
    private int number;
    private List<Unit> unitList = new ArrayList<Unit>();

    public int getNumber() {
        return number;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public Team() {
        count++;
        number = count;
        unitList.add(new Fence(this));
        unitList.add(new Tower(this));
        unitList.add(new Soldier(this));
        unitList.add(new Tank(this));
    }
}
