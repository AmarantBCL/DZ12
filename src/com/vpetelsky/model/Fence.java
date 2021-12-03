package com.vpetelsky.model;

public class Fence extends Structure {

    public Fence(Team team) {
        super(team);
        isBreakable = true;
        mark = "FE";
    }
}
