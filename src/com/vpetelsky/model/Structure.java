package com.vpetelsky.model;

public class Structure extends Unit {

    protected boolean isBreakable;

    public boolean isBreakable() {
        return isBreakable;
    }

    public Structure(Team team) {
        super(team);
    }
}
