package com.vpetelsky.model;

public class Tower extends Structure {

    public Tower(Team team) {
        super(team);
        isBreakable = false;
        mark = "TW";
    }
}
